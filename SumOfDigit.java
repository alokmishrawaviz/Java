import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers.....");
        int n=sc.nextInt();
        System.out.println(n);
        while(n>0){
        	sum=sum+n%10;
        	n=n/10;
        }
	System.out.println(sum);
	}

}
