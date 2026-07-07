package search;
/*
 * Program: Sort Employee IDs Using Insertion Sort
 *
 * Description:
 * This program uses the Insertion Sort algorithm to arrange an array of
 * employee IDs in ascending order. It builds the sorted portion of the
 * array one element at a time by inserting each element into its correct
 * position. Finally, the program displays the array before and after
 * sorting.
 */

public class InsertionSort {

    public static void main(String[] args) {

        int[] empIds = {105, 101, 108, 103, 102};

        System.out.println("Before Sorting:");
        for (int id : empIds) {
            System.out.print(id + " ");
        }

        for (int i = 1; i < empIds.length; i++) {

            int key = empIds[i];
            int j = i - 1;

            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }

            empIds[j + 1] = key;
        }

        System.out.println("\nAfter Sorting:");
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    }
}