package hackerrank;
import java.util.Scanner;
import java.util.regex.*;

public class Patternsyntaxchecker {

	

	
	   public static void main(String[] args){
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	         String pattern = in.nextLine();
	             //Write your code
	          try{
	              //pattern.compile(pattern);
	        	  Pattern.compile(pattern);
	              System.out.println("valid");
	              
	          }catch(PatternSyntaxException  e){
	             System.out.println("Invalid"); 
	          }
	      }
	   }
	}
