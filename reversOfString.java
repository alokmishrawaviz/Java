import java.util.Scanner;

public class reversOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the element of the array");
    for(int i=0;i<n;i++){
    	
    	arr[i]=sc.nextInt();
    }
    for(int j=0;j<n;j++){
    	System.out.print(arr[j]+" ");
    	
    }
    System.out.println("\n");
    for(int i=n-1;i>=0;i--){
    	System.out.print(arr[i]+" ");
    }
	}

}
