package base.animal.data;

public class Animal {
    private int id;
    private String name;
    private String type;
    private String description;
    private int age;
    private boolean star;
    private boolean winner;

    public Animal() {}

    public Animal(Animal originalAnimal) {
        this.id = originalAnimal.id;
        this.name = originalAnimal.name;
        this.type = originalAnimal.type;
        this.description = originalAnimal.description;
        this.age = originalAnimal.age;
        this.star = originalAnimal.star;
        this.winner = originalAnimal.winner;
    }

    public Animal(String name, String type, String description, int age) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.age = age;
    }

    public Animal(String animalString, int age ) {
        String[] animalParts = animalString.split("\\s");
        this.name = animalParts[0];
        this.description = animalParts[1];
        this.type = animalParts[2];
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStar() {
        return star;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return String.format(" %-10s | %-10s | %-10s | %-5s |",
            name,
            type,
            description,
            age
        );
    }
}