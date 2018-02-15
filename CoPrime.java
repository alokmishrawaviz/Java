package alok;

import java.util.Arrays;
import java.util.Scanner;

public class CoPrime {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
	 int[] arr=new int[n];
	 for(int i=0;i<arr.length;i++){
		 arr[i]=sc.nextInt();
		
	 }
	 Arrays.sort(arr);
		// TODO Auto-generated method stub
		int result =CountCoprime(arr);
		System.out.println(result);
		// TODO Auto-generated method stub

	}



static int CountCoprime(int[] arr) throws java.lang.Exception
{
	int c=0;
	
	//int n=sc.nextInt();
	int max=(arr.length)-1;
	for(int i=0;i<arr.length;i++){
		
	
     for(int j=i+1;j<arr.length;j++){
    //	 int w=arr[i]
    	 
	for(int r=2;r<max;r++)
	{  int p=arr[i]%r;
	   int q=arr[j]%r; 
	   //System.out.println(arr[i]+" "+ q + "   "+arr[r]+"  " +  p);

		if(p!=0 && q!=0){
			//System.out.println(arr[r]+" "+arr[i]);
			c++;
		}
	 }
    }
	}
	return c;
}
}
	