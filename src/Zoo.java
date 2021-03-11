import java.util.Arrays;
import java.util.Scanner;

public class Zoo {

    private Animal[] animals;

    public Zoo(Animal[] animal) {
        this.animals = animal;
    }

    public Zoo() {
        animals = new Animal[]{};
    }

    public void addAnimal(Animal animal){
        animals = Arrays.copyOf(animals, animals.length + 1);
        animals[animals.length - 1] = animal;
    }

    public void deleteAnimal(Animal animal){
        Animal[] newAnimals = new Animal[animals.length - 1];
        int index = 0;
        for (Animal currentAnimal : animals) {
            if (currentAnimal != animal) {
                newAnimals[index++] = currentAnimal;
            }
        }
        animals = newAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animal=" + Arrays.toString(animals) +
                '}';
    }
}
