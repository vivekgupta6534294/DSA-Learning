package functionAndArrays;

import java.io.*;
import java.util.*;

public class BrokenEconomy {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        binarySearch(arr, k);
    }

    public static void binarySearch(int arr[], int k) {
        int low = 0, high = arr.length - 1;
        int ceil = -1, floor = -1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (arr[mid] == k) {
                ceil = arr[mid];
                floor = arr[mid];
                break;

            } else if (k > arr[mid]) {
                low = mid + 1;
                floor = arr[mid];
            } else {
                ceil = arr[mid];
                high = mid - 1;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
        return;

    }

}