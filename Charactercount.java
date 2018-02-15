
public class Charactercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
  String s1="Akhilesh gupta";

  char[] ch=s1.toLowerCase().toCharArray();
  for(int j=97;j<=122;j++)
 
 
  {
	  for(int i=0;i<ch.length;i++) 
		   {
		  if(ch[i]==j){
			count++;  
		  }
		 
	  }
	  char b1 = (char) j;
	  if(count!=0){
	   System.out.println(b1 +"          ="+count);
	   if(count!=0){
		   count=0;
	   }
	  }
  }
 
	}

}
