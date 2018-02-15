import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int n1=sc.nextInt();
		 int n2=sc.nextInt();
		 while(n2!=0){
			 int r=0;
			 r=n1%n2;
			// n2=r;
			 n2=n1;
			 n1=r;
			 
		 }
		 System.out.println("hcf is "+n1);

	}

}
