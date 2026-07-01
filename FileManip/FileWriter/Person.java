public class Person {
    // TODO 1: Add instance variables: name (String), age (int), weight (double)
    private String name;
    private int age;
    private double weight;

    // TODO 2: Create constructor with 3 parameters
    Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // TODO 3: Implement toString() method
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nWeight: " + weight + " Lbs";
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
}
