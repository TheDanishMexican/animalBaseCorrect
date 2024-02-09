package base.animal.app;

import base.animal.data.InitializeData;

public class Application {
    AnimalController animalController;
    InitializeData initializeData;
    public Application() {
        this.animalController = new AnimalController();
        this.initializeData = new InitializeData(animalController);
    }

    public static void main(String[] args) {
        Application application = new Application();


    }
}
