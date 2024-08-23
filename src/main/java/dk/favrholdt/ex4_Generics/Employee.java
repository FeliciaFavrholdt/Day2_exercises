package dk.favrholdt.ex4_Generics;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Employee {

    private String name;
    private int age;
    private LocalDate birthDate;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}