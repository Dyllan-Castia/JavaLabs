import java.util.ArrayList;

public class CarSearch {
    ArrayList<Car> cars = new ArrayList();

    public CarSearch(){
        cars.add(new Car("Ford", "Mustang", "Blue", 38320.00, "IN STOCK"));
        cars.add(new Car("Toyota", "Camry", "Green", 28484.00, "DEALER TRADE"));
        cars.add(new Car("Honda", "Accord", "Red", 31984.00, "DEALER TRADE"));
        cars.add(new Car("Ford", "Mustang", "Red", 41000.00, "IN STOCK"));
        cars.add(new Car("Toyota", "Camry", "Blue", 31044.00, "DEALER TRADE"));
        cars.add(new Car("Honda", "Accord", "Green", 28484.00, "FACTORY ORDER"));
        cars.add(new Car("Ford", "Escort", "Blue", 30990.00,   "FACTORY ORDER"));
        cars.add(new Car("Toyota", "Corolla", "Green", 23450.00, "IN STOCK"));
        cars.add(new Car("Honda", "Civic", "Red", 25500.00, "IN STOCK"));
        cars.add(new Car("Ford", "Escort", "Red", 38849.00, "FACTORY ORDER"));
        cars.add(new Car("Toyota", "Corolla", "Blue", 28959.00, "IN STOCK"));
        cars.add(new Car("Honda", "Civic", "Green", 28462.00, "IN STOCK"));
        cars.add(new Car("Ford", "Mustang", "Blue", 70990.00, "IN STOCK"));
        cars.add(new Car("Toyota", "Camry", "Green", 32248.00, "DEALER TRADE"));
        cars.add(new Car("Honda", "Accord", "Red", 33984.00, "FACTORY ORDER"));
        cars.add(new Car("Ford", "Mustang", "Red", 55600.00, "DEALER TRADE"));
        cars.add(new Car("Toyota", "Camry", "Blue", 29755.00, "IN STOCK"));
        cars.add(new Car("Honda", "Accord", "Green", 29758.00, "FACTORY ORDER"));
        cars.add(new Car("Ford", "Escort", "Blue", 35838.00, "DEALER TRADE"));
        cars.add(new Car("Toyota", "Corolla", "Green", 25324.00, "IN STOCK"));
        cars.add(new Car("Honda", "Civic", "Red", 28484.00, "FACTORY ORDER"));
        cars.add(new Car("Ford", "Escort", "Red", 33000.00, "IN STOCK"));
        cars.add(new Car("Toyota", "Corolla", "Blue", 24428.00, "DEALER TRADE"));
        cars.add(new Car("Honda", "Civic", "Green", 28583.00, "FACTORY ORDER"));
    }


    public ArrayList<Car> searchAvailability(String availability) {

        // TODO 1: Create a results ArrayList to hold the search results
        ArrayList<Car> results = new ArrayList<>();

        /* TODO 2: Loop over the cars array, comparing the value of the
                   availability field to the method parameter. Save
                   matching cars to the results array list. */
        for (Car car : cars) {
            if (car.availability.equals(availability)) {
                results.add(car);
            }
        }

        /* TODO 3: if the results is empty, print a message saying
                   nothing was found */
        if (results.isEmpty()) {
            System.out.println("Nothing was found");
        }

        // TODO 4: Return results ArrayList.

        return results;
    }


    public ArrayList<Car> search(String make, String model, String color){

        // TODO 5: Create a results ArrayList to hold the search results
        ArrayList<Car> results = new ArrayList<>();

        /* TODO 6: Loop over the cars array, comparing the value of the
                   make, model, and color fields to the method
                   parameters. */
        /* TODO 7: if the make, model, and color of the Car instance
                   match the method parameters, add it to the results
                   ArrayList. */
        for (Car car : cars) {
            if (car.make.equals(make) && car.model.equals(model) && car.color.equals(color)) {
                results.add(car);
            }
        }
        // TODO 8: If the results is empty. Print a message.
        if (results.isEmpty()) {
            System.out.println("No matching results.");
        }

        // TODO 9: Return the results ArrayList
        return results;
    }

    public ArrayList<Car> searchPrice(double priceLimit, boolean lowerThan){

        /* TODO 10: Create a results ArrayList to hold the search
                    results */
        ArrayList<Car> results = new ArrayList<>();

        /* TODO 11: Loop over the cars array, comparing the price field
                    to the method parameters. */
        /* TODO 12: If the boolean variable lowerThan is true and a car's price
                    is less than priceLimit, add that car to the results */
        /* TODO 13: If the lowerThan boolean is false, add all the
                    cars whose price is greater than the priceLimit
                    to the results */
        for (Car car : cars) {
            if (car.price < priceLimit && lowerThan) {
                results.add(car);
            } else if (car.price > priceLimit && !lowerThan) {
                results.add(car);
            }
        }
        // TODO 14: If the results is empty. Print a message.
        if (results.isEmpty()) {
            System.out.println("No matches.");
        }
        // TODO 15: Return the results ArrayList
        return results;
    }


    public static void main(String [] args){


        CarSearch carSearch = new CarSearch();

        System.out.println("\nList cars IN STOCK");
        ArrayList carsFound = carSearch.searchAvailability("IN STOCK");
        if(carsFound != null) {
            for (Object obj : carsFound) {
                Car car = (Car) obj;
                System.out.println(car);
            }
        }

        System.out.println("\nList all Red, Ford Mustangs");
        carsFound = carSearch.search("Ford", "Mustang", "Red");
        if(carsFound != null) {
            for(Object obj : carsFound){
                Car car = (Car) obj;
                System.out.println(car);
            }
        }

        System.out.println("\nList all cars under $25,000.00");
        carsFound = carSearch.searchPrice(25000.00, true);
        if(carsFound != null) {
            for(Object obj : carsFound){
                Car car = (Car) obj;
                System.out.println(car);
            }
        }

        System.out.println();
    }
}

/*Output:

List cars IN STOCK
Ford	Mustang	Blue	$38320.0	: IN STOCK
Ford	Mustang	Red		$41000.0	: IN STOCK
Toyota	Corolla	Green	$23450.0	: IN STOCK
Honda	Civic	Red		$25500.0	: IN STOCK
Toyota	Corolla	Blue	$28959.0	: IN STOCK
Honda	Civic	Green	$28462.0	: IN STOCK
Ford	Mustang	Blue	$70990.0	: IN STOCK
Toyota	Camry	Blue	$29755.0	: IN STOCK
Toyota	Corolla	Green	$25324.0	: IN STOCK
Ford	Escort	Red		$33000.0	: IN STOCK

List all Red, Ford Mustangs
Ford	Mustang	Red		$41000.0	: IN STOCK
Ford	Mustang	Red		$55600.0	: DEALER TRADE

List all cars under $25,000.00
Toyota	Corolla	Green	$23450.0	: IN STOCK
Toyota	Corolla	Blue	$24428.0	: DEALER TRADE


Process finished with exit code 0

*/
