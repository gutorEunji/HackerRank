import java.io.*;
import java.util.*;

public class Day10_BinaryNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count = 0;
        
        while(true) {
			if (num > 1) {
				map.put(count, (num%2));
				num = num / 2;
				count ++;
			}
			else {
				map.put(count, (num%2));
				break;
			}
		}
        
		int maxCount = 0;
		count = 0;
        
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i) == 1) {
				while(i < map.size()) {                    
					if (map.get(i) == 1) {
                        i++;
						count++;
					}
                    else {
                        break;
					}
				}
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
			}
        }
        
		System.out.println(maxCount);

    }
}