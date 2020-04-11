import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        int postiveNumbers = 0;
        int negativeNumbers = 0;
        int zeroNumbers = 0;
        int arraySize = arr.length;

        for(int i = 0; i < arraySize; i++) {
            if(arr[i] > 0) {
                postiveNumbers += 1;
            } else if(arr[i] < 0) {
                negativeNumbers += 1;
            } else {
                zeroNumbers += 1;
            }
        }

        float positivesValues = postiveNumbers / (float) arraySize;
        float negativeValues = negativeNumbers / (float) arraySize;
        float zeroValues = zeroNumbers / (float) arraySize;
        
        System.out.println(positivesValues); 
        System.out.println(negativeValues); 
        System.out.println(zeroValues); 

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];


        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);
        scanner.close();
    }
}
