package base.animal.data;

import base.animal.app.AnimalController;

public class InitializeData {
    AnimalController animalController;
    public InitializeData(AnimalController animalController) {
        this.animalController = animalController;

        Animal test1 = new Animal("Harry falling Horse", 12);
        Animal test2 = new Animal("Larry jumping Cat", 42);
        Animal test3 = new Animal("Bobby walking Dog", 56);
        Animal test4 = new Animal("Martin sleeping Cat", 32);
        Animal test5 = new Animal("Peter cooking Monkey", 78);
        Animal test6 = new Animal("Markus running Sloth", 34);

        animalController.createAnimal(test1);
        animalController.createAnimal(test2);
        animalController.createAnimal(test3);
        animalController.createAnimal(test4);
        animalController.createAnimal(test5);
        animalController.createAnimal(test6);
    }


}
