import java.util.Scanner;

public class ConjecativeOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		String str=sc.next();
		char[] ch=str.toCharArray();
		int count=0;
		int max=0;
		int secLastMax=0;
		for(int i=0;i<ch.length;i++){
			
			if(ch[i]=='1'){
				count++;
				if(count>max){
				secLastMax = max;
//				System.out.println("sec = "+secLastMax);	
					max=count;
				}
			}
			else
					 count=0;
			}
			
				System.out.println("max length of String"+max );
				System.out.println( " Secmax length of String "+secLastMax);
			}
			
			

	}


