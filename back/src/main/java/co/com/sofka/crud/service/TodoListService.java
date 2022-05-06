package co.com.sofka.crud.service;

import co.com.sofka.crud.dto.TodoListDTO;
import co.com.sofka.crud.model.TodoList;

import java.util.List;
import java.util.Optional;

public interface TodoListService {

    //listar
    List<TodoListDTO> list();

    //save
    TodoListDTO save(TodoListDTO todoListDTO);

    //update
    TodoListDTO update(TodoListDTO todoListDTO, Long id);

    //delete
    void delete(Long id);

    //get
    TodoListDTO get(Long id);

}
