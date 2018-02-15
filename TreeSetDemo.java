package com.collection.alok;

import java.util.Comparator;
import java.util.TreeSet;
class sortById implements Comparator<Employee>

{

	@Override
	public int compare(Employee obj1,Employee obj2) {
		// TODO Auto-generated method stub
		return ((Integer) obj1.getId()).compareTo((Integer)obj2.getId());
	}
	}

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String city;

	@Override
	public String toString(){
		return "id "+ id +" name "+ name +" city "+ city +"\n";
	}
	
	
	Employee(int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public int compareTo(Employee obj) {
		// TODO Auto-generated method stub
		return this.name.compareTo(obj.name);
	}
	
	
}


public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TreeSet<Employee> emp=new TreeSet<>(new sortById());
		TreeSet<Employee> emp=new TreeSet<>((obj1,obj2)->((Integer)obj1.getId()).compareTo((Integer)obj2.getId()));
		Employee emp3=new Employee(2, "alok", "lko");
		emp.add(emp3);
		Employee emp2=new Employee(1, "Ram", "Lmp");
		emp.add(emp2);
		//Employee emp3=new Employee(2, "alok", "lko");
		Employee emp1=new Employee(1, "Ram", "Lmp");
		emp.add(emp1);
		System.out.println(emp);
		

	}

}
