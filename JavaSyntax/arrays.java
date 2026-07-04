//Coursera example
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
        daysInMonth[10] = 30; // November
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

//USEFULL GUIDES

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

//initialize with default values
int[] numbers = new int[4]; // numbers contains: [0, 0, 0, 0]

//different types get different values
int[] nums = new int[3];          // [0, 0, 0]
double[] prices = new double[3];  // [0.0, 0.0, 0.0]
boolean[] flags = new boolean[3]; // [false, false, false]
String[] names = new String[3];   // [null, null, null]

//Fill an array using a loop
int[] numbers = new int[10];

for (int i = 0; i < numbers.length; i++) {
    numbers[i] = i + 1;
} //Contains [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

//Initialize with user input
Scanner input = new Scanner(System.in);

int[] scores = new int[5];

for (int i = 0; i < scores.length; i++) {
    System.out.print("Enter score " + (i + 1) + ": ");
    scores[i] = input.nextInt();
}

//Parallel arrays
String[] names = {"Coffee", "Tea", "Latte"};
double[] prices = {3.50, 2.75, 5.25};

for (int i = 0; i < names.length; i++) {
    System.out.println(names[i] + ": $" + prices[i]);
} 
//output 
//Coffee: $3.5
//Tea: $2.75
//Latte: $5.25

//Array of objects
String[] animals = new String[3];

animals[0] = "Tiger";
animals[1] = "Penguin";
animals[2] = "Dolphin";
//or
String[] animals = {"Tiger", "Penguin", "Dolphin"};

//Declare array then fill with the instansiations
Dog[] dogs = new Dog[2]; //This initially contains: [null, null]

dogs[0] = new Dog("Max");
dogs[1] = new Dog("Buddy");

//2D array
int[][] grid = new int[3][4];

//can assign values like this
grid[0][0] = 5;
grid[0][1] = 10;
grid[1][0] = 15;

//Or initialize directly
int[][] numbers = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

//print 2D arrays with nested loops
for (int row = 0; row < numbers.length; row++) {
    for (int col = 0; col < numbers[row].length; col++) {
        System.out.print(numbers[row][col] + " ");
    }
    System.out.println();
}

//Fill arrays with same value
import java.util.Arrays;

int[] scores = new int[5];

Arrays.fill(scores, 100); // [100, 100, 100, 100, 100]

//Print array quickly
import java.util.Arrays;

int[] scores = {90, 85, 100};

System.out.println(Arrays.toString(scores));
