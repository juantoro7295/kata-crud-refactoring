package co.com.sofka.crud.model;

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


}
