package Alok.Interview;

import java.util.Scanner;

public class Knoldus {
  public void palindrome(int  number ){
	  int num,sum=0,temp,r;
	  while(number!=sum){
		  number=number+1;
		  temp=number;
		  sum=0;
		   while(temp!=0){
			   r=temp%10;
			   sum=(sum*10)+r;
			   temp=temp/10;
		   }
		  
	  }
	  System.out.print(sum);
  }
	public static void main(String[] args) {
		
	 Knoldus kn=new Knoldus();
     Scanner sc=new Scanner(System.in);
     int n= sc.nextInt();
     for(int i=1;i<=n;i++){
    	 kn.palindrome(sc.nextInt());
    	 System.out.println();
     }
    
	}

}
