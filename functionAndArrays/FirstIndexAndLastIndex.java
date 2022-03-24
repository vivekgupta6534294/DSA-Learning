package functionAndArrays;

import java.io.*;
import java.util.*;

public class FirstIndexAndLastIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int FirstIndex = firstIndex(arr, key);
        int LastIndex = lastIndex(arr, key);
        System.out.println(FirstIndex + "\n" + LastIndex);
        sc.close();
    }

    public static int firstIndex(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        int firstIdx = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (k < arr[mid]) {
                high = mid - 1;
            } else if (k > arr[mid]) {
                low = low + 1;
            } else {
                firstIdx = mid;
                high = high - 1;
            }
        }
        return firstIdx;
    }

    public static int lastIndex(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        int lastIdx = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (k < arr[mid]) {
                high = mid - 1;
            } else if (k > arr[mid]) {
                low = low + 1;
            } else {
                lastIdx = mid;
                low = low + 1;
            }
        }
        return lastIdx;

    }

}
