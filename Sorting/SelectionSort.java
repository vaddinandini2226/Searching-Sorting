package search;
/*
 * Program: Sort Student Scores Using Selection Sort
 *
 * Description:
 * This program uses the Selection Sort algorithm to arrange an array of
 * student scores in ascending order. It repeatedly selects the smallest
 * element from the unsorted portion of the array and places it at its
 * correct position in the sorted portion. Finally, the program displays
 * the array before and after sorting.
 */

public class SelectionSort {

    public static void main(String[] args) {

        int[] scores = {85, 70, 95, 60, 78};

        System.out.println("Before Sorting:");
        for (int score : scores)
            System.out.print(score + " ");

        for (int i = 0; i < scores.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < scores.length; j++) {

                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }

        System.out.println("\nAfter Sorting:");
        for (int score : scores)
            System.out.print(score + " ");
    }
}
