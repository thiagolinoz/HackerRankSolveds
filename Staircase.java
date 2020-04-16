import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {

        String hash;
        String space;

        for(int x = 1; x <= n; x++) {
            hash = String.join("", Collections.nCopies(x, "#"));
            space = String.join("", Collections.nCopies(n - x, " "));
            System.out.println(space + hash);
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
