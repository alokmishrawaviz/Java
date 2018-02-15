package hackerrank;
import java.lang.reflect.*;
//import java.lang.reflect.Method;



  
	
	
 
 public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		int counter=0; 
		//StudentInfo info=new StudentInfo();
		//info.getName();
		

		Class obj = Class.forName("StudentInfo");
		Method []method = obj.getDeclaredMethods();
		for (Method method2 : method) {
			System.out.println(method2.getName());
			counter++;
		}
		System.out.println(counter);
	}

	}
