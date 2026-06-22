public class Car {
    String make = "none";
    String model = "none";
    String color = "none";
    int year = 0;

    public String getCarDetails() {
        String message = "Make: " + make + "\nModel: " + model
                + "\nColor: " + color + "\nYear: " + year;
        return message;
    }
}
