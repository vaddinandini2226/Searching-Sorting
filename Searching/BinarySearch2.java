/*
 * Program: Find the Peak Element in an Array
 *
 * Description:
 * This program uses the Binary Search algorithm to find the peak element
 * in an array. A peak element is an element that is greater than or equal
 * to its adjacent elements. By comparing the middle element with its next
 * element, the search space is reduced until the peak element is found.
 * Finally, the program displays the index and value of the peak element.
 */
package search;
public class BinarySearch2 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1])
                left = mid + 1;
            else
                right = mid;
        }

        System.out.println("Peak Index = " + left);
        System.out.println("Peak Element = " + arr[left]);
    }
}