import java.io.*;
import java.util.*;

public class Day09_Recursion {
    
    public static int factorial(int n1, int n2) {
        if (n1 <= 1) {
            return 1;
        }
        else {
            return (n1 *factorial(n2, n2 -1));
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(factorial(num, num-1));
        
    }
}