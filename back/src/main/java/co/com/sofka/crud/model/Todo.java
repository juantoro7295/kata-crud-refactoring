package co.com.sofka.crud.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "todo_id", length = 200)
    private Long id;

    @NotEmpty
    @Size(min = 5, max = 100, message = "Debes tener entre 5 y 100 caracteres")
    @Column(name = "name_todo", length = 100)
    private String name;

    @Column(name = "completed_todo", nullable = false)
    private boolean completed;

    @ManyToOne(fetch = FetchType.LAZY,
            targetEntity = TodoList.class,
            optional = false)
    @JoinColumn(name = "todolist_id")
    @JsonBackReference
    private TodoList todoList;




}
