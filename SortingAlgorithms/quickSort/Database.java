import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Database {

    private ArrayList<Registration> registrations = new ArrayList<>();

    public Database() {

        // Initialize the ArrayList of registrations with simpler data
        registrations.add(new Registration("E", "Tyler Lennon"));
        registrations.add(new Registration("A", "Margaret Finn"));
        registrations.add(new Registration("C", "Zane Hallworth"));
        registrations.add(new Registration("G", "Jodi Gatfield"));
        registrations.add(new Registration("F", "Harvey Kenny"));
        registrations.add(new Registration("W", "Janice Hudson"));
        registrations.add(new Registration("D", "Larry Newman"));
    }

    public void printAll() {
        for (Registration obj : registrations) {
            System.out.println(obj);
        }
    }

    public void quickSort() {

        /* TODO 1: Initialize a high index variable to the size of
                   the registrations array minus 1. */
        int highIndx = registrations.size() - 1;

        /* TODO 2: Initialize a low index variable to zero */
        int lowIndx = 0;

        /*
         * An empty list or one-element list is already sorted.
         */
        if (highIndx <= lowIndx) {
            return;
        }

        /* TODO 3: Create a Stack to store pairs of low and high indexes for subarrays.
                   Use the stack to iteratively perform QuickSort until all subarrays are processed. */
        Stack<int[]> stack = new Stack<>();

        // Place the boundaries of the entire ArrayList on the stack.
        stack.push(new int[]{lowIndx, highIndx});

        while (!stack.isEmpty()) {

            // Remove the next pair of subarray boundaries.
            int[] indexes = stack.pop();

            lowIndx = indexes[0];
            highIndx = indexes[1];

            /* TODO 4: Within the stack-based loop, call the partition()
                       method passing in the current high and low indexes */

            /* TODO 5: Store the pivot index returned by partition()
                       to decide which subarrays to push onto the stack next */
            int pivotIndx = partition(lowIndx, highIndx);

            /* TODO 22: Implement an If-Else-If-Else statement. The If clause is
                       true when the pivot index minus 1 exceeds the low index. */

            /* TODO 23: When the If clause is true, set the high index equal
                       to the pivot index minus 1 */

            // Push the left subarray if it contains at least two elements.
            if (pivotIndx - 1 > lowIndx) {
                stack.push(new int[]{lowIndx, pivotIndx - 1});

            // A two-element range still needs to be processed.
            } else if (pivotIndx - 1 == lowIndx) {
                stack.push(new int[]{lowIndx, pivotIndx - 1});
            }

            /* TODO 24: Implement the Else-If clause so it's true when the
                       pivot index plus 1 is less than the high index */

            /* TODO 25: When Else-If is true, set the low index equal to
                       the pivot index plus 1 */

            // Push the right subarray if it contains at least two elements.
            if (pivotIndx + 1 < highIndx) {
                stack.push(new int[]{pivotIndx + 1, highIndx});

            // A two-element range still needs to be processed.
            } else if (pivotIndx + 1 == highIndx) {
                stack.push(new int[]{pivotIndx + 1, highIndx});
            }

            /* TODO 26: When neither the If nor the Else-IF clause is true,
                       implement the Else clause to break out of the
                       while loop and end the sort */

            /*
             * No explicit break is needed here. When neither side needs
             * processing, nothing is pushed. The loop ends naturally when
             * the stack becomes empty.
             */
        }
    }

    private int partition(int lowIndx, int highIndx) {

        /* TODO 6: Create a subarray from the registrations array that
                   starts at the low index and ends at the high index
                   plus 1 */
        List<Registration> subArray =
                registrations.subList(lowIndx, highIndx + 1);

        /* TODO 7: Initialize the pivot element to the last element in the
                   subarray */
        Registration pivot =
                subArray.get(subArray.size() - 1);

        /* TODO 8: Initialize a greater-than index with negative 1 */
        int gtIndx = -1;

        /* TODO 9: Create a for loop initializing a current index variable
                   to zero.
           TODO 10: Set the condition so the loop runs as long as the
                    current index is less than the last index of the subarray.
           TODO 11: Increment the current index at the end of each iteration.
         */
        for (int currIndx = 0;
             currIndx < subArray.size() - 1;
             currIndx++) {

            /* TODO 12: Get the element at the current index */
            Registration currentElement =
                    subArray.get(currIndx);

            /* TODO 14: Comment out the print statement below */
            // System.out.println("Pivot: " + pivot.license +
            //         ", Current: " + currentElement.license);

            /* TODO 15: Implement an IF statement whose condition is true when
                       the current element's license is less than or equal to
                       the pivot element's license. */
            if (currentElement.license.compareTo(pivot.license) <= 0) {

                /* TODO 16: If true, increment the greater-than index */
                gtIndx++;

                /* TODO 17: Implement a nested IF statement whose condition
                           is true if the greater-than index is less than
                           the current index. */
                if (gtIndx < currIndx) {

                    /* TODO 18: If true, call the swap() method passing in
                               the subarray, the greater-than index, and
                               the current index */
                    swap(subArray, gtIndx, currIndx);
                }
            }
        }

        /* TODO 19: After the for loop, initialize a pivot index variable
                   equal to the greater-than index plus 1 */
        int pivotIndx = gtIndx + 1;

        /* TODO 20: Call the swap() method passing in the subarray, the
                   pivot index, and the index of the last element in the
                   subarray */
        swap(subArray, pivotIndx, subArray.size() - 1);

        /* TODO 21: Replace the return with the pivot index plus the
                   low index as an offset to the registrations array. */
        return pivotIndx + lowIndx;
    }

    private void swap(
            List<Registration> subArray,
            int i,
            int j) {

        Registration iElement = subArray.get(i);
        Registration jElement = subArray.get(j);

        subArray.set(i, jElement);
        subArray.set(j, iElement);
    }

    public void bubbleSort() {
        int n = registrations.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                Registration currentReg = registrations.get(j);
                Registration nextReg = registrations.get(j + 1);

                if (currentReg.license.compareTo(nextReg.license) > 0) {
                    registrations.set(j, nextReg);
                    registrations.set(j + 1, currentReg);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public void insertionSort() {
        int regCount = registrations.size();

        for (int unsortedIndx = 1;
             unsortedIndx < regCount;
             unsortedIndx++) {

            Registration unsortedReg =
                    registrations.get(unsortedIndx);

            int sortedIndx = unsortedIndx - 1;

            while (sortedIndx >= 0) {
                Registration sortedReg =
                        registrations.get(sortedIndx);

                if (sortedReg.license.compareTo(
                        unsortedReg.license) > 0) {

                    registrations.set(
                            sortedIndx + 1,
                            sortedReg
                    );

                    sortedIndx--;
                } else {
                    break;
                }
            }

            registrations.set(
                    sortedIndx + 1,
                    unsortedReg
            );
        }
    }

    public void mergeSort() {
        int n = registrations.size();

        for (int subArrSize = 1;
             subArrSize < n;
             subArrSize *= 2) {

            for (int leftStart = 0;
                 leftStart < n - subArrSize;
                 leftStart += 2 * subArrSize) {

                int rightStart =
                        leftStart + subArrSize;

                int rightEndExcluded =
                        Math.min(
                                leftStart + 2 * subArrSize,
                                n
                        );

                ArrayList<Registration> leftArray =
                        new ArrayList<>(
                                registrations.subList(
                                        leftStart,
                                        rightStart
                                )
                        );

                ArrayList<Registration> rightArray =
                        new ArrayList<>(
                                registrations.subList(
                                        rightStart,
                                        rightEndExcluded
                                )
                        );

                merge(
                        leftStart,
                        leftArray,
                        rightArray
                );
            }
        }
    }

    private void merge(
            int mergeIndex,
            ArrayList<Registration> leftArray,
            ArrayList<Registration> rightArray) {

        int leftIndx = 0;
        int rightIndx = 0;

        while (leftIndx < leftArray.size()
                && rightIndx < rightArray.size()) {

            Registration leftVal =
                    leftArray.get(leftIndx);

            Registration rightVal =
                    rightArray.get(rightIndx);

            if (leftVal.license.compareTo(
                    rightVal.license) <= 0) {

                registrations.set(
                        mergeIndex,
                        leftVal
                );

                leftIndx++;
            } else {
                registrations.set(
                        mergeIndex,
                        rightVal
                );

                rightIndx++;
            }

            mergeIndex++;
        }

        while (leftIndx < leftArray.size()) {
            Registration leftVal =
                    leftArray.get(leftIndx);

            registrations.set(
                    mergeIndex,
                    leftVal
            );

            leftIndx++;
            mergeIndex++;
        }

        while (rightIndx < rightArray.size()) {
            Registration rightVal =
                    rightArray.get(rightIndx);

            registrations.set(
                    mergeIndex,
                    rightVal
            );

            rightIndx++;
            mergeIndex++;
        }
    }

    public static void main(String[] args) {

        Database db = new Database();

        db.quickSort();

        /* TODO 27: Uncomment the last two lines */
        System.out.println(
                "\n******* Sorted ArrayList ******\n"
        );

        db.printAll();
    }
}
