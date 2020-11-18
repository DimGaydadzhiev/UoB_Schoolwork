package Lab6AB;

public class PetRecord {

    private String name;
    private int age;
    private double weight;

    public PetRecord(String initialName, int initialAge, double initialWeight) {
        name = initialName;
        if ((initialAge < 0) || (initialWeight < 0)) {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        } else {
            age = initialAge;
            weight = initialWeight;
        }
    }

    public PetRecord(String initialName) {
        name = initialName;
        age = 0;
        weight = 0;
    }

    public PetRecord(int initialAge) {
        name = "No name yet.";
        weight = 0;
        if (initialAge < 0) {
            System.out.println("Error: Negative age.");
            System.exit(0);
        } else
            age = initialAge;
    }

    public PetRecord(double initialWeight) {
        name = "No name yet";
        age = 0;
        if (initialWeight < 0) {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        } else
            weight = initialWeight;
    }

    public PetRecord() {
        name = "No name yet.";
        age = 0;
        weight = 0;
    }

    public void setAll(String newName, int newAge, double newWeight) {
        name = newName;
        if ((newAge < 0) || (newWeight < 0)) {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        } else {
            age = newAge;
            weight = newWeight;
        }
    }

    public void setName(String newName) {
        name = newName; // age and weight are unchanged.
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Error: Negative age.");
            System.exit(0);
        } else
            age = newAge; // name and weight are unchanged.
    }

    public void setWeight(double newWeight) {
        if (newWeight < 0) {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        } else
            weight = newWeight; // name and age are unchanged.
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " pounds");
    }
}
