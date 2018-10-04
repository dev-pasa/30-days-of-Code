import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    // Complete the factorial function below.
    public static int factorial(int n) {
        if (n <= 0){
            return 0;
        } else{
            return n + factorial(n - 1);
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.print(result);
               scanner.close();
    }
}
