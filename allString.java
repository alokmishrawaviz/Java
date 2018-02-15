import java.util.Scanner;

public class allString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		int count=0;
		String s1=sc.nextLine();
		char[] ch=s1.toLowerCase().toCharArray();
		 
		
		for(int a=97;a<=122;a++){
		  for(int j=0;j<ch.length;j++){
			  if((int)ch[j]==a){
				count++;
				break;
			  }
		  }	
		}
		if(count==26){
		System.out.println("panagram");}
		else{
			System.out.println("is not panagram");
		}
	}

}
