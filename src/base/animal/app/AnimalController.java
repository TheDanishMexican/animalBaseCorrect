package base.animal.app;

import base.animal.data.Animal;
import base.animal.data.AnimalNameComparator;

import java.util.*;

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
        List<Animal> allAnimals = new ArrayList<>(idToAnimal.values());

//        for(Animal animal : idToAnimal.values()) {
//            allAnimals.add(animal);
//            System.out.println("Added animal: " + animal.getName() + " to the array");
//        }

//        allAnimals.addAll(idToAnimal.values());

        return allAnimals;
    }

    public Set<Animal> getAllAnimalsSorted() {
        System.out.println(String.format("\t\t\t\t\t\t%-10s | %-10s | %s | %-5s |",
                "NAME",
                "TYPE",
                "DESCRIPTION",
                "AGE"
                ));
        Set<Animal> animalsSorted= new TreeSet<Animal>(idToAnimal.values());

        return animalsSorted;
    }

    public List<Animal> getAllAnimalsSorted(Comparator<Animal> comparator) {
        System.out.println(String.format("\t\t\t\t\t\t%-10s | %-10s | %s | %-5s |",
                "NAME",
                "TYPE",
                "DESCRIPTION",
                "AGE"
        ));

        List<Animal> allAnimals = new ArrayList<>(idToAnimal.values());

        allAnimals.sort(comparator);

        return allAnimals;
    }
}
