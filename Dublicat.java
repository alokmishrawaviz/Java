package String;

import java.util.Scanner;

public class Dublicat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String s1=sc.next();
     int count =0;
     char[] in=s1.toCharArray();
     System.out.println("Dublicat element are");
     for(int i=0;i<s1.length();i++){
    	for(int j=i+1;j<s1.length();j++) {
    		if(in[i]==in[j]){
    			//System.out.println(in[j]);
    			count++;
    			
    		}
    	}
    	
     }
     System.out.println(count);
	}

}
