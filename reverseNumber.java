import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
    char[] ch= s.toCharArray();
    for(int i=ch.length-1;i>=0;i--)  {
    System.out.print(ch[i]); 	
    }
	}

}
//rev=rev*10+n%10;
//n=n/10;