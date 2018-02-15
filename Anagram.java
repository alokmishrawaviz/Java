package alok;
import java.io.*;
import java.util.*;
 
public class Anagram{
static boolean isAnagram(String a, String b) {

	
	char c[]=a.toLowerCase().toCharArray();
	char d[]=b.toLowerCase().toCharArray();
	Arrays.sort(c);
	Arrays.sort(d);
	return Arrays.equals(c, d);
    // Complete the function
}


	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        

        
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
