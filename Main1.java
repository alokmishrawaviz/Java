package hackerrank;

import java.util.Scanner;

abstract class Book{
	String title;
	abstract void setTitle(String s);
	
	String getTitle(){
		return title;
	}
}
class MyBook extends Book{

	@Override
	void setTitle(String s) {
	this.title=s;
		
	}
	
}


public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
	}

}
