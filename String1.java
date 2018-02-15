package hackerrank;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		int lengthA=A.length();
		int lengthB=B.length();
		sum=lengthA+lengthB;
		System.out.println(sum);
		
		if(A.compareTo(B)>0){
			System.out.println("Yes");
		}else
		{
			System.out.println("No");
		}
		String s1 = A.substring(0, 1).toUpperCase() + A.substring(1);
		String s2=B.substring(0, 1).toUpperCase()+B.substring(1);
		System.out.println(s1+ " " +s2);
	}

}
