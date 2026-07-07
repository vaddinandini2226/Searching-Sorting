package search;
/*
 * Program: Find the Rotation Index in a Rotated Sorted Array
 *
 * Description:
 * This program uses the Binary Search algorithm to find the rotation
 * index in a rotated sorted array. The rotation index represents the
 * position of the smallest element in the array. By repeatedly comparing
 * the middle element with the rightmost element, the search space is
 * reduced until the smallest element is located. Finally, the program
 * displays the rotation index and the smallest element.
 */

public class BinarySearch1 {
    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 1, 2, 3};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        System.out.println("Rotation Index = " + left);
        System.out.println("Smallest Element = " + arr[left]);
    }
}
