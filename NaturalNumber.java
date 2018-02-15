import java.util.Scanner;

class natural{
	public int naturalNumb(int a,int b){
		if(a<=b){
			System.out.println(a+" ");
			return (naturalNumb(++a, b));
		}
		return 1;
		}
}
public class NaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   natural nb=new natural();
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   nb.naturalNumb(1, n);
	}

}
