/*
 * Program: Sort Student Marks Using Bubble Sort
 *
 * Description:
 * This program uses the Bubble Sort algorithm to arrange an array of
 * student marks in ascending order. It repeatedly compares adjacent
 * elements and swaps them whenever they are in the wrong order. The
 * process continues until the entire array is sorted. Finally, the
 * program displays the array before and after sorting.
 */
package search;
public class BubbleSort {

    public static void main(String[] args) {

        int[] marks = {85, 70, 95, 60, 78};

        System.out.println("Before Sorting:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks.length - 1 - i; j++) {

                if (marks[j] > marks[j + 1]) {

                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter Sorting:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
