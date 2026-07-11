public class ExamSchedule {
    private ExamNode head;
    private ExamNode current;

    public ExamSchedule() {
        this.head = null;
        this.current = null;
    }

    // TODO 2: Implement logic to add an exam to the end of the linked list
    public void addExam(String examDetails) {
        // YOUR CODE HERE
        ExamNode newNode = new ExamNode(examDetails);

        if (head == null) {
            head = newNode;
            current = newNode;
        } else {
            ExamNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        System.out.println("Exam added: " + examDetails);
    }

    // TODO 3: Implement the logic to move to the next exam in the list and displays it
    public void viewNextExam() {
        // YOUR CODE HERE
        if (current == null) {
            System.out.println("No exams available.");
        } else {
            if (current.next != null) {
                current = current.next;
                System.out.println("Next Exam: " + current.examDetails);
            } else {
                System.out.println("You have reached the last exam.");
            }
        }
    }

    // TODO 4: Implement logic to move to the previous exam in the list and display it
    public void viewPreviousExam() {
        // YOUR CODE HERE
        if (current == null) {
            System.out.println("No exams available.");
        } else {
            if (current.prev != null) {
                current = current.prev;
                System.out.println("Previous Exam: " + current.examDetails);
            } else {
                System.out.println("No previous exams.");
            }
        }
    }

    public void viewAllExamSchedule() {
        ExamNode temp = head;
        if (temp == null) {
            System.out.println("No exams scheduled.");
        } else {
            System.out.println("Exam Schedule:");
            while (temp != null) {
                System.out.println(temp.examDetails);
                temp = temp.next;
            }
        }
    }
}
