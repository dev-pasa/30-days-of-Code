import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
 
for(int i = 0; i < N; i++){
    String string = scanner.nextLine();
    char[] charArray = string.toCharArray();

    for(int j = 0; j < charArray.length; j++){
        if(j % 2 ==0){
            System.out.print(charArray[j]);
        }
    }
    System.out.print(" ");
    for(int j = 0; j < charArray.length; j++){
        if(j % 2 !=0){
            System.out.print(charArray[j]);
        }
    }
        System.out.println(" ");
}
scanner.close();
}
}
