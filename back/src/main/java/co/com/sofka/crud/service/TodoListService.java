package co.com.sofka.crud.service;

import co.com.sofka.crud.model.TodoList;

import java.util.List;

public interface TodoListService {

    //listar
    List<TodoListService> list();

    //save
    TodoList save(TodoList todoList);

    //update
    TodoList update(TodoList todoList);

    //delete
    void delete(Long id);

    //get
    TodoList get(Long id);


}
