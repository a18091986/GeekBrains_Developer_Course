package src;

import java.awt.datatransfer.FlavorEvent;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List <Animal> animals = new ArrayList<>();

    private Radio radio;

    public List<Animal> getAnimals() {
        return animals;
    }
    public Zoo addAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public List <Sayable> getSayable (){
        List<Sayable> sayables = new ArrayList<>();
        for (var item: animals) {
            sayables.add(item);
        }
        sayables.add(radio);
        return sayables;
    }

    public List<Walkable> walkables(){
        List <Walkable> walkables = new ArrayList<>();
        for (var item: animals) {
            if (item instanceof Walkable)
                walkables.add((Walkable) item);
        }
        return walkables;
    }
    public List<Flyable> flyables(){
        List <Flyable> flyables = new ArrayList<>();
        for (var item: animals) {
            if (item instanceof Flyable)
                flyables.add((Flyable) item);
        }
        return flyables;
    }
    public List<Swimable> swimables(){
        List <Swimable> swimables = new ArrayList<>();
        for (var item: animals) {
            if (item instanceof Swimable)
                swimables.add((Swimable) item);
        }
        return swimables;
    }

    public Walkable WalkWinner() {
        int index = 0;
        for (int i = 0; i < walkables().size(); i++) {
            if (walkables().get(i).walk_speed() > walkables().get(index).walk_speed())
                index = i;
        }
        return walkables().get(index);
    }

    public Flyable FlyWinner() {
        int index = 0;
        for (int i = 0; i < flyables().size(); i++) {
            if (flyables().get(i).fly_speed() > flyables().get(index).fly_speed())
                index = i;
        }
        return flyables().get(index);
    }
    public Swimable SwimWinner() {
        int index = 0;
        for (int i = 0; i < swimables().size(); i++) {
            if (swimables().get(i).swim_speed() > swimables().get(index).swim_speed())
                index = i;
        }
        return swimables().get(index);
    }

}
