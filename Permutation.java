import java.util.Scanner;

public class Permutation {
    public void permutation(String s,int i,int j)
      {
    	  if(i==j)
    	   {
    		System.out.println(s);
    	    }
    	
    	  else
    	   { 
    		 
    	     for(int k=i;k<=j;k++)
    	        {
    		      s=swap(s,i,k);
    		      permutation(s,i+1,j);
    		      s=swap(s,i,k);
    		
    	        }
           }
     }
    
    public String swap(String s,int i, int j)
      {
    	 char temp;
    	 char arr[]=s.toCharArray();
    	 temp=arr[i];
    	 arr[i]=arr[j];
    	 arr[j]=temp;
    	 
		return String.valueOf(arr);
      }
    
	public static void main(String[] args) 
	  {
		// TODO Auto-generated method stub
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter the String..");
      String s=in.next();
      int length=s.length();
      
      Permutation pr=new Permutation();
      pr.permutation(s, 0, length-1);
      
      
	 }

}
