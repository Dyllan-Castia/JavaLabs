import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IdeaWriter {

    public void writeIdea(String filePath, String fileContents) {

        // TODO 7: Create a File object with the given filePath
        File file = new File("src/" + filePath + ".txt");

        // TODO 8: Convert the fileContents String into a byte array
        byte[] fileBytes = fileContents.getBytes();

        // TODO 9: Pass the File object to the FileOutputStream constructor
        try (FileOutputStream outputStream = new FileOutputStream(file)) {

            // TODO 10: Call the write() method on the output stream to save the byte array
            outputStream.write(fileBytes);
        } catch (FileNotFoundException e) {
            System.err.println("File not found! Please check the path and try again!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
