package base.animal.app;

import base.animal.data.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalController {
    private Map<Integer, Animal> idToAnimal;
    private int count = 1;

    public AnimalController() {
        idToAnimal = new HashMap<Integer, Animal>();
    }

    public void createAnimal(Animal animal) {
        Animal newAnimal = new Animal(animal);
        System.out.println("Added animal: " + newAnimal.getName() + " to the HashMap with ID: " + count);
        idToAnimal.put(count, newAnimal);
        count++;
    }

    public Animal getAnimal(int id) {
        System.out.println("Returned animal with name: " + idToAnimal.get(id).getName());
        return idToAnimal.get(id);
    }

    public void updateAnimal(int id, Animal animal) {
        Animal newAnimal = new Animal(animal);
        System.out.println("Updated animal: " + idToAnimal.get(id).getName() + "to animal: " + animal.getName());
        idToAnimal.put(id, animal);
    }

    public void deleteAnimal(int id) {
        System.out.println("Deleted animal: " + getAnimal(id).getName());
        idToAnimal.remove(id);
    }

    public List<Animal> getAllAnimals() {
        List<Animal> allAnimals = new ArrayList<>();

        for(Animal animal : idToAnimal.values()) {
            allAnimals.add(animal);
            System.out.println("Added animal: " + animal.getName() + " to the array");
        }

        return allAnimals;
    }
}
