import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size ...");
		int n=sc.nextInt();
		int p=1;
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=n-i+1;j++){
				System.out.print(p+" ");}
				if(i<(n+1)/2){
					p++;
				
				}
				
				else if(i==n/2)
				  p=p;
				
					
				else
				p--;
			
			System.out.println("\n");
		}

		}}


