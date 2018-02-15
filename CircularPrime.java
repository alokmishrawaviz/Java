import java.util.Scanner;

class prime{
	public void isCircularPrime(int n){
		int a=n;
		do{
			System.out.println(a);
			if(isPrime(a)==false){
				System.out.println(n +"is not prime number");
				break;
			}
			a=circulate(a);
			
		}while(a!=n);
		System.out.println(n+"is circuler prime");
	
	}
	private boolean isPrime(int a) {
		boolean flag=true;
		
		
		for(int i=2;i<=a-1;i++){
			if(a%i==0){
				flag=false;
			}
		}
		if(flag=true){
			return true;
		}else{
		return false;}
	}

	private int circulate(int n) {
		String s=Integer.toString(n);
		String p=s.substring(1)+s.charAt(0);
		int a=Integer.parseInt(p);
		return 0;
	}

}

public class CircularPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
  prime prime1=new prime();
  prime1.isCircularPrime(n);
	}
}

