import java.util.Scanner;

public class From1t1000Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
      int count ;
      System.out.println("prime number are....");
      for(int i=1;i<=1000;i++){
    	  count=0;
    	  for(int j=2;j<i;j++){
    		 
    		 if(i%j==0){
    			 count++;
    		 } 
    	  }
    	  if(count==0){
    		  
    	      System.out.println(i+" ");
    	      }
      }
     
	}

}
