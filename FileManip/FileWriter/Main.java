import java.io.*;
import java.util.Scanner;

public class Main {

    // Task 2 - Write Person to file1.txt using FileWriter
    // TODO 4: Add a static method textFileWrite() that returns void
    public static void textFileWrite() {
        // TODO 5: Create Person object
        Person person = new Person("Dyllan", 31, 190.5);
        String personInfo = person.toString();

        // TODO 6-7: Write to file using FileWriter in try-catch
        // TODO: Print message "File written with FileWriter..."

        try (FileWriter writer = new FileWriter("file1.txt")) {
            writer.write(personInfo);
            System.out.println("File written with FileWriter...");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    //  Task 3 - Write user input to file2.txt using PrintWriter
    // TODO 8: Define a static method printWrite() that returns void
    public static void printWrite() {
        // TODO 9: Take input using Scanner
        // TODO 10: Create Person object
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name, Age, then weight. Press enter after each: ");
        Person human = new Person(in.nextLine(), in.nextInt(), in.nextDouble());
        String humanInfo = human.toString();

        // TODO 11-12: Write to file using PrintWriter in try-catch
        // TODO: Print message "File written with PrintWriter..."
        try (PrintWriter pWriter = new PrintWriter("file2.txt")) {
            pWriter.println(humanInfo);
            System.out.println("File written with printWriter...");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    // Task 4 - Write byte array to binary file3.dat using FileOutputStream
    // TODO 13: Define a static method writeBinaryNumbers() that returns void
    // TODO 14: Declare byte array
    public static void writeBinaryNumbers() {
        byte[] numbers = {-5, 0, 13, 20, 127};

        // TODO 15-17: Write bytes using FileOutputStream in try-catch
        // TODO: Print message "File written with FileOutputStream..."
        try (FileOutputStream fileOS = new FileOutputStream("file3.dat")) {
            for (byte number : numbers) {
                fileOS.write(number);
            }
            System.out.println("File written with writeBinaryNumbers...");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    // Task 5 - Write Person object to binary file4.dat using DataOutputStream
    //TODO 18: Define a static method writePersonBinary() that returns void
    // TODO 19: Read input using Scanner
    // TODO 20: Create Person object
    public static void writePersonBinary() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name, Age, and weight. Press enter after each entry: ");
        Person moogie = new Person(in.nextLine(), in.nextInt(), in.nextDouble());

        // TODO 21-23: Write attributes using DataOutputStream in try-catch
        // TODO: Print message "File written with DataOutputStream..."
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("file4.dat"))) {
            dos.writeUTF(moogie.getName());
            dos.writeInt(moogie.getAge());
            dos.writeDouble(moogie.getWeight());
            System.out.println("File written with DataOutputStream...");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        // TODO 24: Call all static methods to test
        textFileWrite();
        printWrite();
        writeBinaryNumbers();
        writePersonBinary();
    }
}
