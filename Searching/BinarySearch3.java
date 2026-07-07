/*
 * Program: Search for an Element in a Sorted 2D Matrix
 *
 * Description:
 * This program uses the Binary Search algorithm to search for a target
 * element in a sorted 2D matrix. The matrix is treated as a single
 * sorted array by converting the one-dimensional index into row and
 * column indices. If the target element is found, the program displays
 * true; otherwise, it displays false.
 */
package search;
public class BinarySearch3 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };

        int target = 9;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        boolean found = false;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int r = mid / cols;
            int c = mid % cols;

            if (matrix[r][c] == target) {
                found = true;
                break;
            }

            if (matrix[r][c] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        System.out.println(found);
    }
}
