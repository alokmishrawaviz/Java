import java.util.Arrays;
import java.util.Scanner;

public class CharacterCount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String.....");
		String s1=sc.nextLine().trim();
		char[] ch=s1.toCharArray();
		Arrays.sort(ch);
		int count ;
		for(int i=0;i<ch.length;i=i+count){
			 count=0;
			for(int j=0;j<ch.length;j++){
				if(ch[i]==ch[j]){
					count++;
				}
				
			}
			System.out.println(ch[i]+"   "+count);
		}

	}

}
