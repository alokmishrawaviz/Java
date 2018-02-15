import java.util.ArrayList;

public class CollectionExample {

	public static void main(String[] args) 
	
	{
		ArrayList list=new ArrayList();
	// ArrayList <Integer> list=new ArrayList<Integer>();
     list.add("alok");
	 list.add(101);
	 list.add(1, "vivek");
	  String in= (String)list.get(0);
	  System.out.println(in);
	 //list.remove(0);
	 System.out.println(list);
	 String nn="alok";
	 Object mm="Alok";
	 //System.out.println(nn);
	// System.out.println(mm);
	 
	 int t=10;
	 Integer t1=new Integer(10);//boxing
	int m = t1.intValue();
	 System.out.println(t);
	 System.out.println(m);
	 
	 Integer a=100;
	 System.out.println(a);
	 
	 

		Object temp = "mike";  // Upcasting
		Object t7 = new String("mike");
	
		System.out.println(temp);
		System.out.println(t7);
		
		ArrayList<Integer> list1=new ArrayList<>();
		//this is a geniric type and it is take only integer
		list1.add(122);
		list1.add(333);
		int var=list1.get(0);
		System.out.println(var);
	}

}
