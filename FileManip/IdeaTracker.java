import java.io.FileInputStream;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IdeaTracker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Idea Tracker!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Read Idea from File");
            System.out.println("2. Write Idea to File");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    // TODO 6: Read idea from a file using IdeaReader
                    System.out.print("Enter file name: ");
                    String readFile = keyboard.nextLine();

                    IdeaReader reader = new IdeaReader();
                    System.out.println(reader.readIdea(readFile));

                    break;

                case 2:
                    // TODO 11: Write idea to a file using IdeaWriter
                    System.out.print("Enter the file name: ");
                    String writeFile = keyboard.nextLine();

                    System.out.print("Enter your idea: ");
                    String idea = keyboard.nextLine();

                    IdeaWriter writer = new IdeaWriter();
                    writer.writeIdea(writeFile, idea);

                    break;

                case 3:
                    System.out.println("Thank you for using the Idea Tracker!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);

        keyboard.close();
    }
}
