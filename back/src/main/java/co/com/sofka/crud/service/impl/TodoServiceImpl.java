package co.com.sofka.crud.service.impl;

import co.com.sofka.crud.dto.TodosDTO;
import co.com.sofka.crud.model.Todo;
import co.com.sofka.crud.repository.TodoRepository;
import co.com.sofka.crud.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private ModelMapper mapper;



    @Transactional
    public List<TodosDTO> list() {
        return null;
    }
    @Override
    public TodosDTO save(TodosDTO todo) {
        return null;
    }

    @Override
    public Todo update(Todo todo, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Todo get(Long id) {
        return null;
    }
}
