package co.com.sofka.crud.service;


import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.model.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    //listar
    List<TodoDTO> list();

    //save
    TodoDTO save(TodoDTO todoDTO);

    //update
    TodoDTO update(TodoDTO todoDTO, Long id);

    //delete
    void delete(Long id);

    //get
    TodoDTO get(Long id);
}
