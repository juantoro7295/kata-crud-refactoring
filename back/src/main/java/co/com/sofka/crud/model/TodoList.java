package co.com.sofka.crud.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "todolist")
public class TodoList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "id_list", length = 100)
    private Long id;

    @NotEmpty
    @Size(min = 5, max = 100, message = "Debes tener entre 5 y 100 caracteres")
    @Column(name= "name_list", length = 100)
    private String name;

    @OneToMany(mappedBy = "todoList",
            targetEntity = Todo.class,
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Todo> todos;




}
