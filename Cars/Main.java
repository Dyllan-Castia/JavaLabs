import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car myFirstCar = new Car();
        myFirstCar.make = "Ford";
        myFirstCar.model = "Ranger";
        myFirstCar.color = "Red";
        myFirstCar.year = 1991;

        myFirstCar.getCarDetails();
        Car[] cars = new Car[5];
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 5; index++) {
            cars[index] = new Car();
            System.out.println("Enter details for car " + (index + 1));
            System.out.print("Make: ");
            cars[index].make = scanner.nextLine();
            System.out.print("Model: ");
            cars[index].model = scanner.nextLine();
            System.out.print("Color: ");
            cars[index].color = scanner.nextLine();
            System.out.print("Year: ");
            cars[index].year = scanner.nextInt();
            scanner.nextLine();
        }
        
        for (int n = 0; n < 5; n++) {
            String carDetails = cars[n].getCarDetails();
            System.out.println(carDetails);
        }
    }
}
