package alok;


import java.util.ArrayList;
import java.util.Scanner;
public class Niven 
{	
	public  int numSum(int i)	
	{		
	
		int sum=0;		
	
		String s=Integer.toString(i);
	    int len=s.length();
	    int num=Integer.parseInt(s);
	   for(int j=1;j<=len;j++)	
	     {			
		     sum=sum+i%10;			
		     i=i/10;		
		 }	
	      return sum;
	      }		
 public int checkSeqOuput(int i,int ans)
 {
	int seq=0;	
	if(i%ans==0)	
	{			seq++;		}
	return seq;	}			
public static void main(String[] args) {	   
	Scanner scan=new Scanner(System.in);	    
	int base=scan.nextInt();	
	int seq=scan.nextInt();	     
	int checkSeq=0;	    	   
	Niven c=new Niven();	  
	for(int i=1;true;i++)	     {	    
		
		
		int baseSum=c.numSum(i);	   
		int ans= Integer.parseInt(c.baseOutput(baseSum,base));	     
		while(i%ans==0)		   {			
			checkSeq++;			 
			
			i++;		    	 
			baseSum=c.numSum(i);	
			ans= Integer.parseInt(c.baseOutput(baseSum,base));	
			//System.out.println(ans);
		}	
		if(checkSeq==seq)	     {	
			System.out.println(i-seq);	
			return;	     }	   
		else	     {	    	
			checkSeq=0;	     
			}	     	    	 	
		}	     	                   
	}
public  String baseOutput(int number, int base)	{	   
		int quotient = number / base;	    
		int remainder = number % base;	    
		if (quotient == 0) 
			// base case	  
			{
			return Integer.toString(remainder);      	  
			}	    
		else	    {
			
			return baseOutput(quotient, base) + Integer.toString(remainder);	  
			}            	
		}		
}
