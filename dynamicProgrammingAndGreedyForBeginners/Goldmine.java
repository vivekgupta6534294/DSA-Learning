import java.io.*;
import java.util.*;
 
public class Main {
 
  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
 
    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = scn.nextInt();
      }
    }
    int[][] memo = new int[n][m];
    int ans = 0;
    for (int i = 0; i < n; i++) {
      ans = Math.max(ans, rec(i, 0, arr, memo));
 
    }
    System.out.println(ans);
 
  }
 
  public static int rec(int r, int c, int[][] arr, int[][] memo) {
    int n = arr.length;
    int m = arr[0].length;
 
    if (c == m - 1) {
      return arr[r][c];
    }
    if (memo[r][c] != 0) return memo[r][c];
 
    int ans = 0;
    if (r - 1 >= 0) {
      ans = Math.max(rec(r - 1, c + 1, arr, memo), ans);
    }
 
    ans = Math.max(rec(r, c + 1, arr, memo), ans);
    if (r + 1 < n) {
      ans = Math.max(rec(r + 1, c + 1, arr, memo), ans);
    }
    return memo[r][c] = ans + arr[r][c];
 
  }
  public static int tab( int[][] arr, int[][] memo) {
    int n = arr.length;
    int m = arr[0].length;
 
    int ans = 0;
    for (int c = m - 1; c >= 0; c--) {
      for (int r = 0; r < n - 1; r++) {
        if (c == m - 1) {
          memo[r][c] = arr[r][c];
 
        } else if (r == 0) {
          ans = Math.max(memo[r][c + 1], memo[r + 1][c + 1]);
          memo[r][c] = ans + arr[r][c];
        } else if (r == n) {
          ans = Math.max(memo[r][c + 1], memo[r - 1][c + 1]);
          memo[r][c] = ans + arr[r][c];
        } else {
          ans = Math.max(memo[r][c + 1], memo[r - 1][c + 1]);
          ans = Math.max(ans, memo[r + 1][c + 1]);
          memo[r][c] = ans + arr[r][c];
        }
 
      }
    }
    for (int i = 0; i < n; i++ ) {
      ans = Math.max(ans, memo[i][0]);
 
    }
    return ans;
  }
 
 
}