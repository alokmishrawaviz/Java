package com.collection.alok;

import java.util.ArrayList;

class Emplyee{
	int id;
	String name;
	Double salary;
	
	Emplyee(int id, String name,Double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
		@Override
		public String toString(){
		return	"id"+id +"name"+name+"salary"+salary+"\n";
		}
	
}
public class StreamDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		for(int i=0;i<=10;i++){
			l.add(i);
		}
		int Intsum= l.stream().filter((current)->current>5).mapToInt((current)->current).sum();
		
		//System.out.println(Intsum);// TODO Auto-generated method stub
		ArrayList<CashCustomer> customerList = new ArrayList<>();
		for(int i = 1; i<=10; i++){
			customerList.add(new CashCustomer(i, "Ram"+i, 1000*i));		//ArrayList<CashCustomer> customerList = new ArrayList<>();
			
				
		}
		System.out.println(customerList);
		double intsum=customerList.stream().filter((currentObject)->currentObject.balance>5000)
				.mapToDouble((current)->current.balance).sum();
		System.out.println(intsum);
	}

	}
