package co.com.sofka.crud.service;


import co.com.sofka.crud.dto.TodosDTO;
import co.com.sofka.crud.model.Todo;

import java.util.List;

public interface TodoService {
    //listar
    List<TodosDTO> list();

    //save
    TodosDTO save(TodosDTO todo);

    //update
    Todo update(Todo todo, Long id);

    //delete
    void delete(Long id);

    //get
    Todo get(Long id);

}
