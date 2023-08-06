package pl.slawek.inheritance;

import pl.slawek.inheritance.model.Chef;
import pl.slawek.inheritance.model.Human;
import pl.slawek.inheritance.model.Solider;

import java.util.ArrayList;
import java.util.List;

class HumanRuner {

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Człowiek");
        human.setSurname("DoWszystkiego");
        human.setAge(40);
        human.setGrowth(185);

        Human solider = new Solider("Kazek", "Zabójca", 44, 175, "Polska");
        Solider angrySolider = new Solider("Stefan", "Morderca", 43, 185, "Polska");
        Human chef = new Chef("Magda", "GesLer", 150, 115);

        List<Human> humans = new ArrayList<>();
        humans.add(human);
        humans.add(solider);
        humans.add(angrySolider);
        humans.add(chef);

        for (Human h: humans) {
            System.out.printf("nazywam się %s %s \n", h.getName(), h.getSurname());

            if (h instanceof Solider) {
                ((Solider) h).kill();
                System.out.println(h.toString());
            }

            System.out.println("Moja klasa to " + h.getClass().getSimpleName() + ", " + h.eat() + "\n");

        }
    }
}
