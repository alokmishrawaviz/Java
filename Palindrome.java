
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=545;
  int temp=n;
  int sum=0,r;
  while(n>0){
	  r=n%10;
	  sum=(sum*10)+r;
	  n=n/10;
  }
  if(temp==sum){
	  System.out.println(temp+ " Number is palindrome");
  }
  
  
	}

}
