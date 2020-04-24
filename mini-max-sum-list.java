import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        Long sumElements = 0L;
        Integer arraySize = arr.length;

        List<Long> list = new ArrayList<Long>();
        for(int i = 0; i < arraySize; i++) {
            for(int j = 0; j < arraySize; j++) {
                if(i == j){
                    continue;
                }
                sumElements += arr[j];
            }
            list.add(sumElements);
            sumElements = 0L;
        }
        Long min = list
            .stream()
            .mapToLong(v -> v)
            .min().orElseThrow(NoSuchElementException::new);

        Long max = list
            .stream()
            .mapToLong(v -> v)
            .max().orElseThrow(NoSuchElementException::new);

        System.out.println(min + " " + max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
