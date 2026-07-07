package search;
/*
 * Program: Sort Product Prices Using Merge Sort
 *
 * Description:
 * This program uses the Merge Sort algorithm to arrange an array of
 * product prices in ascending order. It recursively divides the array
 * into smaller subarrays, sorts each subarray, and then merges them
 * back together in sorted order. Finally, the program displays the
 * array before and after sorting.
 */

public class MergeSort {

    public static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            rightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        int[] prices = {450, 200, 600, 350, 150};

        System.out.println("Before Sorting:");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        mergeSort(prices, 0, prices.length - 1);

        System.out.println("\nAfter Sorting:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}