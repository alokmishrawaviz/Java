package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		  System.out.println("Enter the array size");
         int size=scanner.nextInt();
	     int arr[]=new int[size];
	  
	    for(int i=0;i<size;i++){
	    	arr[i]=scanner.nextInt();
	    }
	    
	    System.out.println("print the array");
	    for(int i=0;i<size;i++){
	    	System.out.println(arr[i]);
	    	
	    	  // System.out.println("Contents : " + Arrays.toString();
	    }
		
	}

}
