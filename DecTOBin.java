import java.util.Scanner;

public class DecTOBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int binary[]=new int[25];
   Scanner sc=new Scanner(System.in) ; 
   int index=0;
   int number=sc.nextInt();
   
   while(number>0){
	 binary[index]=number%2;
	 index++;
	 number=number/2;
   }
   for(int i=index-1;i>=0;i--){
	   System.out.print(binary[i]);
   }
     
	}

}
