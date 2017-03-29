import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day16_ExceptionsStringInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int resInt = 0;
        
        try {
            resInt = Integer.parseInt(S);
            System.out.println(resInt);
        }
        catch(NumberFormatException e){
            // write exception handling logic here
            System.out.println("Bad String");
            
        }

    }
}