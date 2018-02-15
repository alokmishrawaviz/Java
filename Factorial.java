package com.alok;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		if(n<0){
			System.out.println("number should be non nigative");
		}
		else{
		int fact=1;
		for(int i=1;i<=n;i++){
			 fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is = " + fact);
		}
	}

}
