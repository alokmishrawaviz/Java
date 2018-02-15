package com.collection.alok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

import javax.print.attribute.standard.RequestingUserName;




/*class SortByName implements Comparator<Customer>
{

	@Override
	public int compare(Customer obj1, Customer obj2) {
		// TODO Auto-generated method stub
		return obj1.getName().compareTo(obj2.getName());
	}
}*/
//interface CustomerOperation{
final class CustomerOperation{
	   
	//private CustomerOperation(){}
	//generic array list and it hold customer object 
	 static   ArrayList<Customer> customerList=new ArrayList<>();
	
	public static void addnewCutomer(int id ,String name,double salary)
	{
	  Customer customer=new Customer(id, name, salary);
	  customerList.add(customer);
	  System.out.println("Record Added....");
	}
	

	/*public static double getTotalSalary()
	
	{
		//static double totalSalary=0.0;
	 	for(int i=0;i<customerList.size();i++)
	 	{
	 	  Customer currentObj = customerList.get(i);
	 	   totalSalary = totalSalary +currentObj.getSalary();
	 	  
	 	}
*/	
	static double totalSalary=0.0;
   public static  double getSalary(){
	   
	  /* for(int i=0;i<customerList.size();i++){
		   
		   Customer customerCurrentObject=customerList.get(i);
		  totalSalary=totalSalary+customerCurrentObject.getSalary();
	   }
	   
	  
	return totalSalary;
   }*/
	
	
	/*Iterator<Customer> iterator=customerList.iterator();
	while(iterator.hasNext()){
        	Customer	customerObject=iterator.next();
        totalSalary=totalSalary+customerObject.getSalary();
        //iterator.remove();
        //System.out.println(totalSalary);
	}*/
	   
	/*ListIterator<Customer> listIterator=customerList.listIterator();
	while(listIterator.hasNext()){
	  Customer	customerobj=listIterator.next();
	  totalSalary =totalSalary+customerobj.getSalary();
	}
	while(listIterator.hasPrevious()){
		Customer custumerobj=listIterator.previous();
		totalSalary=totalSalary+custumerobj.getSalary();
		
	}*/
	 /*for(Customer customerObj:customerList){
		totalSalary=totalSalary+customerObj.getSalary(); 
	 }*/
	   
	   customerList.forEach((customerObj)
			   ->totalSalary+=customerObj.getSalary());
	   
	return totalSalary;


	
		
	}
   public static boolean updateObject(Customer Object1,Customer Object2){
	boolean obj=customerList.contains(Object1);
	//return obj;
	int p=customerList.indexOf(Object1);
	//System.out.println(p+"sasaS");
	   if(obj==true){
		Customer c=   customerList.set(customerList.indexOf(Object1),Object2);
		 //  customerList.set(p, Object2);
		//System.out.println(c+ "sdsd");
	   //System.out.println("update inside");
	   System.out.println("sdsd1"+customerList);
	   return true;
	   }
	   
	   
	   return obj;
	   
   }
   
// Delete Object
   public static boolean deletObject(Customer deleteObj){
	  int index= customerList.indexOf(deleteObj);
	  if(index>=0){
		  customerList.remove(index);
		 return true; 
	  }else
	return false;
	   
   }
   
// Searching steps
   public static boolean isFound(Customer searchObject){
	   
	return customerList.contains(searchObject);
	   
   }
}
class Customer implements Comparable<Customer>
   {
	 private int id;
	 private String name;
	 private double salary;
	 
	 @Override
	 public int compareTo(Customer object) {
	 	// TODO Auto-generated method stub
	 	//return this.name.compareTo(object.name);//Asc
	 	//return object.name.compareTo(this.name);//Dsc
	 	//return this.name.compareToIgnoreCase(object.name);
		 return ((Double)this.salary).compareTo((Double)object.salary);
	 }
	 @Override
	 public boolean equals(Object object){
	    boolean isFound=false;
	    
	    if(object instanceof Customer)
	    {
	    	Customer customer=(Customer) object;
	    	if(this.id==customer.id &&this.name.equals(customer.name) &&this.salary==customer.salary){
	    		
	    		isFound =true;
	    	}
	    	
	    }
	    return isFound; 
	 }
	 {
		 
	 }
	
	 
      public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	Customer(int id,String name,double salary)
      {
	    this.id=id;
	    this.name=name;
	    this.salary=salary;
      }	
 
  @Override
public String toString() {
	
 return "Id :"+id +", Name :"+name+  ",Salary :" +salary+"\n";
	

}


}
   
   
 

public class CRUDDEMO 
{

	public static void main(String[] args) 
  {
		
       while(true)
       {
	    System.out.println("1. Add");
	    System.out.println("2. Delete");
	    System.out.println("3. Search");
	    System.out.println("4. Update");
	    System.out.println("5. Exit ");
	    System.out.println("6. Read");
	    System.out.println("7. Total Sala");
	    System.out.println("8. Sort By Name");
	    Scanner sc=new Scanner(System.in);
	    int choice=sc.nextInt();
	    
	      if(choice==1)
	      {
	    	System.out.println("enter the id...");
	    	int id=sc.nextInt();
	    	System.out.println("enter the Customer name");
	    	String name=sc.next();
	    	System.out.println("Enter the Customer salary...");
	    	double salary=sc.nextDouble();
	    	
	    	CustomerOperation.addnewCutomer(id, name, salary);
	    	  
	      }
	     if(choice==6)
	       {
	    	 System.out.println(CustomerOperation.customerList);
	       }else
	    	   if(choice==2)
	       {
	    	   System.out.println("Enter the delete id");
	    	   int id=sc.nextInt();
	    	   System.out.println("Enter the delete to name");
	    	   String name=sc.next();
	    	   System.out.println("Enter the delete to salary");
	    	   double salary=sc.nextDouble();
	    	   Customer deletedObj=new Customer(id, name, salary);
	    	   if(CustomerOperation.deletObject(deletedObj)){
	    		   System.out.println("Record deleted");
	    		   System.out.println(CustomerOperation.customerList);
	    	   }else
	    	   {
	    		   System.out.println("Record is not deleted");
	    	   }
	       }
	     if(choice==7)
	       {
	    	 System.out.println(CustomerOperation.getSalary());
	       }
	     else if(choice==4){
	    	 System.out.println("enter the search id");
	    	 int id=sc.nextInt();
	    	 System.out.println("Enter the search name");
	    	 String name=sc.next();
	    	 System.out.println("Enter the search salary");
	    	 double salary=sc.nextDouble();
	    	 Customer obj=new Customer(id, name, salary);
	    	 if(CustomerOperation.isFound(obj)){
	    		 System.out.println("object is found ");
	    		  
	    		 System.out.println("enter the search id");
		    	 int id1=sc.nextInt();
		    	 System.out.println("Enter the search name");
		    	 String name1=sc.next();
		    	 System.out.println("Enter the search salary");
		    	 double salary1=sc.nextDouble();
		    	 Customer obj2=new Customer(id1, name1, salary1);
		    	 if(CustomerOperation.updateObject(obj, obj2)){
		    		 System.out.println("Object is updated...");
		    		 System.out.println(CustomerOperation.customerList);
		    	 }else{
		    		 System.out.println("Object is not updated...");
		    	 }
	    		  
	    	 }
	    	 
	    	 
	     }
	     else if(choice==3){
	    	 System.out.println("enter the search id");
	    	 int id=sc.nextInt();
	    	 System.out.println("Enter the search name");
	    	 String name=sc.next();
	    	 System.out.println("Enter the search salary");
	    	 double salary=sc.nextDouble();
	    	 Customer searchObject=new Customer(id, name, salary);
	    	 if(CustomerOperation.isFound(searchObject)){
	    		System.out.println("Object is found"); 
	    	 }
	    	 else 
	    	 {
	    		 System.out.println("Object is not found");
	    	 }
	     }
	     else if(choice==8){
	    	 /*Collections.sort(CustomerOperation.customerList, new Comparator<Customer>() {

	    		 @Override
	    			public int compare(Customer obj1, Customer obj2) {
	    				// TODO Auto-generated method stub
	    				return obj1.getName().compareTo(obj2.getName());

	    		 }	
	    		
			});*/
	    	 
	    	 Collections.sort(CustomerOperation.customerList,(obj1,obj2)->obj1.getName().compareToIgnoreCase(obj2.getName()));
	    	//Collections.sort(CustomerOperation.customerList);
	    	//System.out.println("After Sort List");
	    	//System.out.println(CustomerOperation.customerList);
	    	
	    //	Collections.sort(CustomerOperation.customerList,new SortByName());
	    	 System.out.println(CustomerOperation.customerList);
	     }
       
       }
   }

}
