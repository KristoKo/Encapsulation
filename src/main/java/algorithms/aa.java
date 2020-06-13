package algorithms;



import java.util.Arrays;
import java.util.Random;

public class aa {

    private static int N = 1000;

    public static void main(String[] args) {
/*        int arr[] = new int[N];
        Random rnd = new Random();
        for (int i = 0; i < N; i++) {
            arr[i] = rnd.nextInt();
        }
        Arrays.sort(arr);
 */
/**
 * write this in recursive later.
 * binary search recursively
 */

/*
    int x = 2;
    //int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    int left = 0;
    int right = arr.length -1;
    int mid;

    while (left <=right) {
        mid = (left + right) / 2;
        if (x == arr.length) {

        }
    }

}
*/


/** Homework:
 * public Node remove(int value) {
 * data equal to this value, remove it from list
 */


/**
 * Implements the binary search algorithm.
 */


    int N = 1000;

        // int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arr[] = new int[N];
        Random rnd = new Random();
        for (int i = 0; i < N; i++) {
            arr[i] = rnd.nextInt();
        }
        Arrays.sort(arr);
        //value to search
        int x = 2;
        int position = search(arr, x);
        if (position >= 0) {
            System.out.println(String.format("Found value %d at position %d.", x, position));
        } else {
            System.out.println(String.format("The value %d was not found.", x));
        }
}
    private static int search(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            // Compute the middle of the searching interval.
            mid = (left + right) / 2;
            if (x == arr[mid]) {
                return mid;
            } else {
                if (x < arr[mid]) {
                    // Search in the left interval.
                    right = mid - 1;
                } else {
                    // Search in the right interval.
                    left = mid + 1;
                }
            }
        }
        // element does not exist in the array
        return -1;
    }
}