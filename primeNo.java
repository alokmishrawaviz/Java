import java.util.Scanner;

public class primeNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int count=0;
	for(int i=2;i<num;i++){
		if(num%i==0){
			count++;
		}
	}
	if(count==0){
	System.out.println(num+" is Prime Number");
	}else{
		System.out.println(num+"is not prime");
	}
}
}
