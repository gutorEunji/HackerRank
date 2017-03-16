//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

public class Day08_DictionariesAndMaps{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Map<String, String> myMap = new HashMap<String, String>();
        Map<Integer, String> searchMap = new HashMap<Integer, String>();
               
        for(int i = 0; i < n; i++){
            String name = in.next();
            String phone = in.nextLine();
            
            myMap.put(name, phone);
        }

        for (int i = 0; i < n; i ++)
        {
            String temp = in.nextLine();
            searchMap.put(i, temp); 
        }

		for (int i = 0; i < n; i ++)
        {
            // Write code here
            if (myMap.containsKey(searchMap.get(i))) {
                String result = myMap.get(searchMap.get(i));
                System.out.println(searchMap.get(i)+"="+result.trim());
            }
            else {
                System.out.println("Not found");
            }
		}

        in.close();
    }
}
