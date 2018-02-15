import java.util.Scanner;

public class SumDiiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("ENter the number...............");
    int number=sc.nextInt();
    int sum=0;
    int num=number;
    while(num>0){
    	sum=sum+num%10;
    	num=num/10;
    }
    if(number%sum==0){
       System.out.println(number + " numer is divisible by its sum");	
    }
    else {
    	System.out.println(number + " number not divisible by its sum");
    }
	}

}
