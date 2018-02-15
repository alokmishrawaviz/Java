import java.util.Scanner;

class Prime{
	 boolean isPrime(int n){
		 int count=0;
		 for(int i=1;i<=n;i++){
			 count++;
		 }
		 if(count==2){
			 System.out.println(n+ " is prime ");
			 return true;
		 }else{
			 System.out.println(n + " is not prime");
		return false;
		 }
	 }
  }
public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter prime number ");
		int n=sc.nextInt();
		Prime p=new Prime();
		
		p.isPrime(n);

	}

}
