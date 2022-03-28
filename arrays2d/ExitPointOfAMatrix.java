package arrays2d;

import java.io.*;
import java.util.*;

public class ExitPointOfAMatrix {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int mat[][] = new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        int direction = 0;
        int i = 0;
        int j = 0;
        // 0 east 1 south2 west3 north
        while (i >= 0 && j >= 0 && i < r && j < c) {
            direction = (direction + mat[i][j]) % 4;
            if (direction == 0) {// east
                j = j + 1;
            } else if (direction == 1) {// south
                i = i + 1;
            } else if (direction == 2) {// west
                j = j - 1;
            } else {// north
                i = i - 1;

            }
        }
        // Coordinate bahar nikal gya h use ander lena hai
        if (direction == 0) {// east
            j = j - 1;
        } else if (direction == 1) {// south
            i = i - 1;
        } else if (direction == 2) {// west
            j = j + 1;
        } else {// north
            i = i + 1;

        }
        System.out.println(i);
        System.out.println(j);
    }
}