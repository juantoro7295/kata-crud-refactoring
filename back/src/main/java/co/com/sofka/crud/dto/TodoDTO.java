package co.com.sofka.crud.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoDTO implements Serializable {
    private Long id;
    private String name;
    private Boolean completed;

}
