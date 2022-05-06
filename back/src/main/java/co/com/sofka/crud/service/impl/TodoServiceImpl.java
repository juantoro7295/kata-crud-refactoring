package co.com.sofka.crud.service.impl;

import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.model.Todo;
import co.com.sofka.crud.repository.TodoRepository;
import co.com.sofka.crud.service.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<TodoDTO> list() {
        List<TodoDTO> list = todoRepository.findAll().stream()
                .map(todo -> mapper.map(todo, TodoDTO.class))
                .collect(Collectors.toList());

        return list;
    }

    @Override
    public TodoDTO save(TodoDTO todoDTO) {
        //DTO a ENTITY
        Todo todoEntity = mapper.map(todoDTO, Todo.class);
        //save
        Todo todo = todoRepository.save(todoEntity);
        //ENTITY a DTO
        TodoDTO todoReturn = mapper.map(todo, TodoDTO.class);

        return todoReturn;
    }

    @Override
    public TodoDTO update(TodoDTO todoDTO, Long id) {
        //DTO a ENTITY
        Todo todoEntity = mapper.map(todoDTO, Todo.class);
        //Update
        Todo todoId = todoRepository.findById(id).orElse(null);
        todoId.setName(todoEntity.getName());
        todoId.setCompleted(todoEntity.isCompleted());
        //ENTITY a DTO
        TodoDTO todoReturn = mapper.map(todoId, TodoDTO.class);
        return todoReturn;
    }

    @Override
    public void delete(Long id) {
        //delete
        Todo todoid = todoRepository.findById(id).orElse(null);
        todoRepository.delete(todoid);
    }

    @Override
    public TodoDTO get(Long id) {
        //get
        Todo todoId = todoRepository.findById(id).orElse(null);
        //ENTITY a DTO
        TodoDTO todoReturn = mapper.map(todoId, TodoDTO.class);

        return todoReturn;
    }
}


