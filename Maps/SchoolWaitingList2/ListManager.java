// TODO 1: Change the HashMap import into a tree map import
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ListManager {

    // TODO 2: Change studentsMap from HashMap to TreeMap
    TreeMap studentsMap = new TreeMap();

    public ListManager(Student [] students){

        for (Student student : students) {
            studentsMap.put(student.lastName, student);
        }
    }
    
    public void listStudents( ) {
        if(studentsMap.isEmpty()){
            System.out.println("The system has no students in the waiting list");
        } else {
            System.out.println("Listing all Students\n");
            Set entries = studentsMap.entrySet();
            for (Object entry : entries) {
                Map.Entry mapEntry = (Map.Entry) entry;
                Student student = (Student)mapEntry.getValue();
                System.out.println(student);
            }
        }

    }

    public void findStudent(String lastName) {
        if(studentsMap.containsKey(lastName)){
            System.out.println("Student Found\n");
            Student student = (Student)studentsMap.get(lastName);
            System.out.println(student);
        }else{
            System.out.println("\nStudent with name '" + lastName + "' Does not exist.");
        }

    }

    public void updateStudentStatus(String lastName, String newStatus){
        Student student = (Student)studentsMap.get(lastName);
        if(student != null){
            String oldStatus = student.status;
            student.status = newStatus;
            studentsMap.put(lastName,student);
            System.out.println();
            System.out.println("Student ("+ lastName +") status was changed from '" + oldStatus + "'' to '" + newStatus + "'");
            System.out.println(student);
        }else {
            System.out.println();
            System.out.println("Student does not exist. Status was not updated.");
        }
    }

    public void removeStudent(String lastName) {
        Student studentRemoved = (Student)studentsMap.remove(lastName);
        if(studentRemoved != null){
            System.out.println();
            System.out.println("Student removed.");
            System.out.println(studentRemoved);
            System.out.println();
        }else{
            System.out.println("Student was not removed.");
        }
    }


    public void findFirstStudent(){

        // TODO 3: Get the first Entry in studentsMap
        Map.Entry<String, Student> firstEntry = studentsMap.firstEntry();

        /* TODO 4: If the first entry exists, get the Student object
            from the entry */
        if (firstEntry != null) {
            // TODO 5: If the Student is not null, print the Student object
            Student firstStudent = firstEntry.getValue();
            if (firstStudent != null) {
                System.out.println(firstStudent);
                // TODO 6: If the Student is not null, return from the method.
                return;
            }
        }
        /* TODO 7: If the first Entry doesn't exist or the Student is
        null, print an error message. */
        System.err.println("Students map is empty.");
    }

    public void findLastStudent(){

        // TODO 9: Get the last Entry in studentsMap
        Map.Entry<String, Student> lastEntry = studentsMap.lastEntry();

        /* TODO 10: If the last entry exists, get the Student object
            from the entry */
        if (lastEntry != null) {
            Student lastStudent = lastEntry.getValue();
            // TODO 11: If the Student is not null, print the Student object
            if (lastStudent != null) {
                System.out.println(lastStudent);
                // TODO 12: If the Student is not null, return from the method.
                return;
            }
        }
        /* TODO 13: If the last Entry doesn't exist or the Student is
            null, print an error message. */
        System.err.println("Students map is empty.");
    }

    public void findNextStudent(String searchString){

        // TODO 15: Find the higher entry after the searchString
        Map.Entry<String, Student> higherEntry = studentsMap.higherEntry(searchString);

        /* TODO 16: If an entry is found, get the Student object
            from the entry */
        if (higherEntry != null) {
            Student higherStudent = higherEntry.getValue();
            // TODO 17: If the student is not null, print the student
            if (higherStudent != null) {
                System.out.println(higherStudent);
                // TODO 18: If the Student is not null, return from the method
                return;
            }
        }
        /* TODO 19: If the higher entry is not found or the
            student is null, print "Student not found." */
        System.err.println("Student not found.");
    }


    public void findPreviousStudent(String searchString) {

        // TODO 22: Find the lower entry before the searchString
        Map.Entry<String, Student> lowerEntry = studentsMap.lowerEntry(searchString);

        // TODO 23: If an entry is found, get the Student object
        if (lowerEntry != null) {
            Student lowerStudent = lowerEntry.getValue();
            if (lowerStudent != null) {
                // TODO 24: If the student is not null, print the student
                System.out.println(lowerStudent);
                /* TODO 25: If the Student is not null, return from the
             method.*/
                return;
            }
        }
        /* TODO 26: If the lower entry is not found or the student is
            null, print "Student not found." */
        System.err.println("Student not found.");
    }
}
