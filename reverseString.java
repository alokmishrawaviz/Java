package hackerrank;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  String S=sc.next();
  String a="alok";
  String b="akhi";
  StringBuffer sb=new StringBuffer(S);
       StringBuffer s1=sb.reverse(); 
      System.out.println(s1);
      System.out.println(S);
       if(S.equals(s1.toString())){
    	   System.out.println("Palindrome");
       }else
       {
    	   System.out.println("Is not palindrome");
       }
	}

}
