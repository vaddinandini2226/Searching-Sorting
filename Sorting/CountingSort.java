package search;
/*
 * Program: Sort Ages Using Counting Sort
 *
 * Description:
 * This program uses the Counting Sort algorithm to arrange an array of
 * ages in ascending order. It creates a count array to store the
 * frequency of each age, then reconstructs the sorted sequence by
 * printing each age according to its frequency. Finally, the program
 * displays the ages in sorted order.
 */

public class CountingSort {

    public static void main(String[] args) {

        int[] ages = {12, 15, 10, 18, 15, 13, 12, 10};

        int max = 18;

        // Create a count array to store the frequency of each age.
        int[] count = new int[max + 1];

        // Update the frequency of each age.
        for (int age : ages)
            count[age]++;

        System.out.println("Sorted Ages:");

        // Print the ages in sorted order based on their frequencies.
        for (int i = 0; i <= max; i++) {

            while (count[i] > 0) {
                System.out.print(i + " ");
                count[i]--;
            }
        }
    }
}