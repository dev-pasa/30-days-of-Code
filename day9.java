import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.Scanner;

public class Solution {
    // Complete the factorial function below.
    public static int factorial(int n) {
        
        if (n <= 0){
            return 1;
        } else{
            return factorial(n - 1)*n;
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.close();
           System.out.print(factorial(n));
               
    }
}
