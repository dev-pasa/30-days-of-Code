import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
                int n = scanner.nextInt();
        scanner.close();
        int sum = 0, count = 0;
        while(n > 0){
            if (n %2 == 1){
                sum++;
         if ( sum > count){
            count = sum;
          } 
        } else {
            sum = 0;
        }
        n = n/2;
        }
        System.out.println(count);
        
    }
    }

