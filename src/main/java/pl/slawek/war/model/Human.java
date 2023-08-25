package pl.slawek.war.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@EqualsAndHashCode
public abstract class Human {
    private String name;
    private String surname;
    private int age;
    private int growth;

    public String eat() {
        return "I eat";
    }
}
