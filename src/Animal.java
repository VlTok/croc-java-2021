import java.util.Scanner;

public class Animal {

    private Cage cage;
    private Employee employee;

    private String type;
    private String name;
    private Integer age;

    private Dictionary medicalHistory;
    private Dictionary animalNutrition;

    public Animal(Cage cage, Employee employee, String type, String name, Integer age, Dictionary medicalHistory, Dictionary animalNutrition) {
        this.cage = cage;
        this.employee = employee;
        this.type = type;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.animalNutrition = animalNutrition;
    }

    public Animal() {
        cage = new Cage();
        employee = new Employee();
        type = "";
        name = "";
        age = 0;
        medicalHistory = new Dictionary();
        animalNutrition = new Dictionary();
    }

    public Animal createAnimal(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя сотрудника: ");
        String nameEmployee = scanner.next();
        System.out.println();
        System.out.print("Введите фамилию сотрудника: ");
        String surnameEmployee = scanner.next();
        System.out.println();
        System.out.print("Введите отчество сотрудника: ");
        String patronymicEmployee = scanner.next();
        System.out.println();
        System.out.print("Введите возвраст сотрудника: ");
        Integer ageEmployee = scanner.nextInt();
        System.out.println();
        System.out.print("Введите должность сотрудника: ");
        String jobEmployee = scanner.next();
        System.out.println();
        Employee employee = new Employee(nameEmployee,surnameEmployee,patronymicEmployee,ageEmployee,jobEmployee);
        Dictionary cleaningCage = new Dictionary();
        Dictionary medicalHistory = new Dictionary();
        Dictionary animalNutrition = new Dictionary();
        System.out.print("Введите размер вольера животного: ");
        String sizeCage = scanner.next();
        System.out.println();
        Cage cage = new Cage(sizeCage,cleaningCage);
        System.out.print("Введите тип животного: ");
        String typeAnimal = scanner.next();
        System.out.println();
        System.out.print("Введите имя животного: ");
        String nameAnimal = scanner.next();
        System.out.println();
        System.out.print("Введите возвраст животного: ");
        Integer ageAnimal = scanner.nextInt();
        System.out.println();
        return new Animal(cage,employee,typeAnimal,nameAnimal,ageAnimal,medicalHistory,animalNutrition);
    }

    public Cage getCage() {
        return cage;
    }

    public void setCage(Cage cage) {
        this.cage = cage;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dictionary getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(Dictionary medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public Dictionary getAnimalNutrition() {
        return animalNutrition;
    }

    public void setAnimalNutrition(Dictionary animalNutrition) {
        this.animalNutrition = animalNutrition;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "cage=" + cage +
                ", employee=" + employee +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", medicalHistory=" + medicalHistory +
                ", animalNutrition=" + animalNutrition +
                '}';
    }
}
