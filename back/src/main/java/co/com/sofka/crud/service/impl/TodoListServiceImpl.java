package co.com.sofka.crud.service.impl;

import co.com.sofka.crud.dto.TodoListDTO;
import co.com.sofka.crud.model.TodoList;
import co.com.sofka.crud.repository.TodoListRepository;
import co.com.sofka.crud.service.TodoListService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class TodoListServiceImpl implements TodoListService {

    @Autowired
    private TodoListRepository todoListRepository;

    @Autowired
    private ModelMapper mapper;


    @Override
    public List<TodoListDTO> list() {
        List<TodoListDTO> list = todoListRepository.findAll().stream()
                .map(todoList -> mapper.map(todoList, TodoListDTO.class))
                .collect(Collectors.toList());
        return list;
    }

    @Override
    public TodoListDTO save(TodoListDTO todoListDTO) {
        //DTO a ENTITY
        TodoList todoListEntity = mapper.map(todoListDTO, TodoList.class);
        //save
        todoListRepository.save(todoListEntity);
        //ENTITY a DTO
        TodoListDTO todoReturn = mapper.map(todoListEntity, TodoListDTO.class);
        return todoReturn;
    }

    @Override
    public TodoListDTO update(TodoListDTO todoListDTO, Long id) {
        //DTO a Entity
        TodoList todoListEntity = mapper.map(todoListDTO, TodoList.class);
        //Update
        TodoList todoListId = todoListRepository.findById(id).orElse(null);
        todoListId.setName(todoListEntity.getName());
        //ENTITY a DTO
        TodoListDTO todoReturn = mapper.map(todoListId, TodoListDTO.class);
        return todoReturn;
    }

    @Override
    public void delete(Long id) {
        //delete
        TodoList todoList = todoListRepository.findById(id).orElse(null);
        todoListRepository.delete(todoList);
    }

    @Override
    public TodoListDTO get(Long id) {
        //get
        TodoList todoListEntity = todoListRepository.findById(id).orElse(null);
        // ENTITY a DTO
        TodoListDTO todoReturn = mapper.map(todoListEntity, TodoListDTO.class);
        return  todoReturn;
    }
}