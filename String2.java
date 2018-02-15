package hackerrank;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
       String s1= S.substring(start,end);
        System.out.println(s1);
	}

}
