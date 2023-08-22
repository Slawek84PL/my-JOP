package pl.slawek.model.soldiers.weapon;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Weapon {
    @Getter
    @Setter
    private String name;

    @Getter
    private int amo;

    private final int MAX_AMO = 50;

    public Weapon() {
        amo = MAX_AMO;
    }

    public void setAmo(int amo) {
//        if (this.getAmo() == amo) {
//            System.out.println("Musisz przełądować");
//        }
        this.amo -= amo;
    }

    protected int reload() {
        return this.amo += MAX_AMO - this.amo;
    }
}
