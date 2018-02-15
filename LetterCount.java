//Program to Find the Number of Letters in a String
class letter{
	public static int letterCount(String str){
		int count=0;
		int index=0;
		while(index<str.length()){
			if(str.charAt(index)!=' '){
				count++;
			}
			index++;
		}
		return count;
		
	}
}
public class LetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  letter lt=new letter();
int t=  lt.letterCount("hello i am alok");
  System.out.println(t);
	}

}
