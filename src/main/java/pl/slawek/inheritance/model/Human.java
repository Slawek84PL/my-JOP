package pl.slawek.inheritance.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Human {
    private String name;
    private String surname;
    private int age;
    private int growth;

    public String eat() {
        return "I eat";
    }
}
