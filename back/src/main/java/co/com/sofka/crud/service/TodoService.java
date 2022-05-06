package co.com.sofka.crud.service;


import co.com.sofka.crud.model.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    //listar
    List<Todo> list();

    //save
    Todo save(Todo todo);

    //update
    Todo update(Todo todo, Long id);

    //delete
    void delete(Long id);

    //get
    Optional<Todo> get(Long id);
}
