import java.util.Scanner;

public class ApplicationMain {
    public static void main(String[] args) {
        Animal monkey = new Animal();
        Animal tiger = new Animal();
        monkey = monkey.createAnimal();
        tiger = tiger.createAnimal();

        Zoo zoo = new Zoo();

        zoo.addAnimal(monkey);
        zoo.addAnimal(tiger);

        Animal[] animals = zoo.getAnimals();
        Scanner scanner = new Scanner(System.in);
        Record record;
        String condition;
        for (Animal animal : animals) {
            System.out.print("Введите болезнь у животного "+animal.getName()+" :");
            condition = scanner.nextLine();
            record = new Record(condition);
            animal.getMedicalHistory().add(record);
            System.out.print("Введите время кормёшки у животного "+animal.getName()+" :");
            condition = scanner.nextLine();
            record = new Record(condition);
            animal.getMedicalHistory().add(record);
        }
        zoo.deleteAnimal(tiger);
        System.out.println(zoo);
    }
}
