package co.com.sofka.crud.service;

import co.com.sofka.crud.model.TodoList;

import java.util.List;
import java.util.Optional;

public interface TodoListService {

    //listar
    List<TodoList> list();

    //save
    TodoList save(TodoList todoList);

    //update
    TodoList update(TodoList todoList, Long id);

    //delete
    void delete(Long id);

    //get
    Optional<TodoList> get(Long id);

}
