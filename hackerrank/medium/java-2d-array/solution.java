import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] values = bufferedReader.readLine().split(" ");

            for (int j = 0; j < 6; j++) {
                arr[i][j] = Integer.parseInt(values[j]);
            }
        }

        int maxSum = Integer.MIN_VALUE;

        // There are 4 x 4 possible hourglasses
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                int sum =
                    arr[i][j]     + arr[i][j + 1]     + arr[i][j + 2]
                                  + arr[i + 1][j + 1]
                    + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);

        bufferedReader.close();
    }
}
