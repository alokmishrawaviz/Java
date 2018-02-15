import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number....");
		int n1=sc.nextInt();
		System.out.println("enter the second number...");
		int n2=sc.nextInt();
		while(n2!=0){
			int r=n1%n2;
			n1=n2;
			n2=r;
		}
		System.out.println("HCF is = " + n1);
	}

}
