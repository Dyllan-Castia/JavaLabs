public class Main {
    public static void main(String[] args) {
        // Step 1: Declare an array
        int[] daysInMonth = new int[12];
        // Step 2: Dynamically initialize the array
        daysInMonth[0] = 31; // January
        daysInMonth[1] = 28; // February
        daysInMonth[2] = 31; // March
        daysInMonth[3] = 30; // April
        daysInMonth[4] = 31; // May
        daysInMonth[5] = 30; // June
        daysInMonth[6] = 31; // July
        daysInMonth[7] = 31; // August
        daysInMonth[8] = 30; // September
        daysInMonth[9] = 31; // October
        daysInMonth[10] = 31; // November
        daysInMonth[11] = 31; // December
        // Step 3: Declare an array with the names of the months
        String[] monthNames = { "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        // Step 4: Print the number of days in each month
        for (int i = 0; i < daysInMonth.length; i++) {
            System.out.println(monthNames[i] + ": " + daysInMonth[i] + " days");
        }
    }
}

//Declare first fill later
int[] scores = new int[5];

scores[0] = 90;
scores[1] = 85;
scores[2] = 100;
scores[3] = 76;
scores[4] = 92;

//Declare and initialize at the same time
int[] scores = {90, 85, 100, 76, 92};
String[] names = {"Megan", "Alex", "Jordan", "Sam"};

//Use new with values
int[] scores = new int[] {90, 85, 100, 76, 92};
//useful when assigning later
int[] scores;

scores = new int[] {90, 85, 100, 76, 92};

//this works
int[] scores = {90, 85, 100};
//this does not work after declaration
int[] scores;
scores = {90, 85, 100}; // error
//you would need
scores = new int[] {90, 85, 100};
