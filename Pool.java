package String;

import java.util.ArrayList;

class IwantToPool{
	  int age;
      String name ;
      
	
	static ArrayList<IwantToPool> pool=new ArrayList<>();
	
	public static IwantToPool intern(int age,String name){
		
		 boolean isFound=false;
		 if(pool.size()==0){
			 
		IwantToPool obj=new IwantToPool(age,name);
		 pool.add(obj);
		 System.out.println("Fresh object added in pool");
		 
		return obj;
		}else
		{
			for(IwantToPool var:pool){
				if(var.age==age&& var.name==name){
					System.out.println("object is already present in pool");
					isFound=true;
					
					return var;
					
				}if(!isFound){
					IwantToPool obj1=new IwantToPool(age, name);
					pool.add(var);
				}
			}
		}
		return null;
	}
	
	private IwantToPool(int age,String name){
		this.age=age;
		this.name=name;
	}
}
public class Pool {
	
	
	
public static void main(String[] args) {
	
IwantToPool obj1=IwantToPool.intern(11, "alok");
IwantToPool obj2=IwantToPool.intern(11, "alok");


}
}
