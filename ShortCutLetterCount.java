class count{
	public static int letterCount(String str){
		return (str.length()-str.split(" ").length)+1;
		
	}
}
public class ShortCutLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   count t=new count();
  int sp= t.letterCount("jhhddasgjgasj jgdjsagjd gjgjdgg ugasg");
  System.out.println(sp);
	}

}
