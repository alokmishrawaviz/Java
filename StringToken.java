package hackerrank;


import java.util.Scanner;

public class StringToken 
 {
  public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine().trim();
             
    	       
            if(s.length()==0){
                System.out.println(0);
                
            }else{
               /* for(String t:arr)
    	         {
    	           System.out.println(t);
    	       
    	         }*/
            	 String [] arr=s.split("[ !,?._'@]+");
                 
      	       System.out.println(arr.length);
            	
            	for(int i=0;i<arr.length;i++){
            		System.out.println(arr[i]);
            		
            	}
    	                
    	        
            scan.close();
        
            }
}
 }
	
