/*
 * Program: Find the First and Last Occurrence of an Element in a Sorted Array
 *
 * Description:
 * This program uses the Binary Search algorithm to find the first and
 * last occurrence of a target element in a sorted array. Two separate
 * binary search methods are used: one searches towards the left to find
 * the first occurrence, while the other searches towards the right to
 * find the last occurrence. Finally, the program displays the indices
 * of the first and last occurrences of the target element.
 */
package search;
public class BinarySearch4 {

    static int firstOccurrence(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return ans;
    }

    static int lastOccurrence(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 6, 8};

        int target = 4;

        System.out.println("First Occurrence = " + firstOccurrence(arr, target));
        System.out.println("Last Occurrence = " + lastOccurrence(arr, target));
    }
}
