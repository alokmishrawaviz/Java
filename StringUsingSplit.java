package hackerrank;
import java.util.Scanner;

	

public class StringUsingSplit{  
public static void main(String args[]){  
	 Scanner sc = new Scanner(System.in);
     String S = sc.nextLine();
     int n = sc.nextInt();
     String smallest="";
     String largest="";
     for(int i = 0;i<=S.length()-n;i++){
         String subString = S.substring(i,i+n);
         //System.out.println(subString);
         if(i == 0){
        	 
             smallest = subString;
             System.out.println("if i==0 then smallest:"+smallest);
         }
         if(subString.compareTo(largest)>0){
        	 System.out.println("Largest:"+largest);
             largest = subString;
         }else if(subString.compareTo(smallest)<0)
        	 System.out.println("Smalest:"+smallest);
             smallest = subString;
     }
     System.out.println(smallest);
     System.out.println(largest);
     
 }
}
