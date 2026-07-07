package search;

/*
 * Program: Sort Employee Salaries Using Heap Sort
 *
 * Description:
 * This program uses the Heap Sort algorithm to arrange an array of
 * employee salaries in ascending order. It first constructs a max heap
 * from the given array and then repeatedly swaps the root element with
 * the last unsorted element. After each swap, the heap is rebuilt to
 * maintain the max heap property until the entire array is sorted.
 * Finally, the program displays the array before and after sorting.
 */

public class HeapSort {

    // Heapify method to create the max heap.
    static void heapify(int[] arr, int n, int i) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    // Heap Sort to sort the max heap.
    static void heapSort(int[] arr) {

        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] salary = {50000, 30000, 70000, 40000, 60000};

        System.out.println("Before Sorting:");
        for (int s : salary)
            System.out.print(s + " ");

        heapSort(salary);

        System.out.println("\nAfter Sorting:");
        for (int s : salary)
            System.out.print(s + " ");
    }
}
