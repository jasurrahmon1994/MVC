package uz.jasur.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Person {
    private int id;
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;

//    @Min(value = 0, message = "Age should be greater than 0")
//    private int age;
//
//    @NotEmpty(message = "Email should not be empty")
//    @Email(message = "Email should be valid")
}
