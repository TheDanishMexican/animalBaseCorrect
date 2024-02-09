package base.animal.app;

import base.animal.data.AgeComparator;
import base.animal.data.AnimalNameComparator;
import base.animal.data.InitializeData;

import java.util.Comparator;

public class Application {
    AnimalController animalController;
    InitializeData initializeData;
    public Application() {
        this.animalController = new AnimalController();
        this.initializeData = new InitializeData(animalController);
    }

    public static void main(String[] args) {
        Application application = new Application();



        System.out.println(application.animalController.getAllAnimalsSorted(
                (a, b) -> a.getType().compareTo(b.getType())));
    }
}
