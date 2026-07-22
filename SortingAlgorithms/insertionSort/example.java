// Declare a public static method that sorts a String array in descending order.
public static void insertionSortDescending(String[] arr) {

    // Store the number of elements in the array.
    int n = arr.length;

    // Start at index 1 because the element at index 0 is already considered sorted.
    for (int counter1 = 1; counter1 < n; counter1++) {

        // Save the current String so it is not lost while other elements shift.
        String key = arr[counter1];

        // Start comparing with the element immediately to the left of the key.
        int counter2 = counter1 - 1;

        // Continue while counter2 is a valid index and the current element
        // belongs after the key in descending alphabetical order.
        while (counter2 >= 0 && arr[counter2].compareTo(key) < 0) {

            // Shift the smaller String one position to the right.
            arr[counter2 + 1] = arr[counter2];

            // Move counter2 one position to the left.
            counter2 = counter2 - 1;
        }

        // Insert the key into the open position found by the while loop.
        arr[counter2 + 1] = key;
    }
}
