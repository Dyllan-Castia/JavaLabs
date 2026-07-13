// TODO 1: Import HashMap, Map, and Set types
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ListManager {

    // TODO 2: Create a new hash map named studentsMap //
    HashMap<String, Student> studentsMap = new HashMap<>();


    public ListManager(Student [] students){
        /* TODO 3:  Iterate through the studentsArray and add the
                    data to the studentsMap. Use the students'
                    last names as the keys and the student
                    objects as the values  */
        for (Student student : students) {
            studentsMap.put(student.lastName, student);
        }
    }


    public void listStudents( ){

        // TODO 4: Check if studentsMap is empty.
        if (studentsMap.isEmpty()) {
            // TODO 5: If studentsMap is empty, print an alert saying that
            System.out.println("Students map is empty.");
        } else { /* TODO 6: If the studentMap is not empty, print a list of all student  */
            System.out.println(studentsMap);
        }
    }

    public void findStudent(String lastName){

        // TODO 8: Check if studentsMap contains the last name.
        if (studentsMap.containsKey(lastName)) {
            // TODO 9: If the key exists, get a reference to the Student object using studentsMap.get(lastName)
            Student student = studentsMap.get(lastName);
            // TODO 10: If the student exists, print the Student object
            System.out.println(student);
        } else {
            // TODO 11: If the student doesn’t exist, print an error message
            System.err.println("Student with name '" + lastName + "' does not exist.");
            return;
        }
    }


    public void updateStudentStatus(String lastName, String newStatus) {
       /* TODO 13: use the get() method on studentMap to obtain a
        reference to the Student object */
        Student student = studentsMap.get(lastName);
        /* TODO 14: if the student exists, change the status to
        newStatus, and print a confirmation message. */
        if (student != null) {
            String previousStatus = student.status;
            student.status = newStatus;
            System.out.println("Status updated from '" + previousStatus + "' to '" + newStatus);
        } else {
            // TODO 15: Print an error message if the student doesn't exist.
            System.err.println("Student does not exist.");
        }
    }

    public void removeStudent(String lastName){
        /* TODO 17: using the lastName parameter, attempt to remove
        a student from the studentsMap */
        Student student = studentsMap.get(lastName);

        if (student != null) {
            /* TODO 18: print a message confirmation and student
            information if the student was successfully removed. */
            studentsMap.remove(lastName);
            System.out.println("Student removed.");
            System.out.println(student);
        } else {
            /* TODO 19: if the student is not removed, print
            a statement that the student was not removed. */
            System.err.println("Student not removed.");
        }
    }
}
