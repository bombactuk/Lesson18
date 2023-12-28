package olga.solution.tasks.task1;

import java.util.Objects;

public class Animal {

    private String name;
    private int age;
    private int energy;


    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.energy = 100;
    }

    public void makeSound() {
        energy -= 10;
    }

    public void eat() {
        energy += 15;
    }

    public void eat(int extraEnergy) {
        energy += extraEnergy;
    }

    public int getEnergy() {
        return energy;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", energy=" + energy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && energy == animal.energy && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, energy);
    }

}
