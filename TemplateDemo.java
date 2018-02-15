package com.collection.alok;

import java.util.ArrayList;
import java.util.HashMap;

class Stack<T extends Object>
//class Stack<T,E>
{
	T data1;
	E data2;
	
	ArrayList<T> list=new  ArrayList<>();
	//HashMap<T,E> map = new HashMap<>();
	
	/*void push(T data1,E data2){
		this.data1=data1;
		this.data2=data2;
	map.put(data1, data2);*/
	void push(T data){
		this.data1=data;
		list.add(data);
		
	}
	void peep(){
		for(int i=list.size()-1;i>=0;i--){
			System.out.println(list.get(i));
		}
	}
}
public class TemplateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Stack<Object> myStack=new Stack<>();
   /* myStack.push("Ram",1);
    myStack.push("alok",2);*/
 /// myStack.push(data);
  myStack.push("alok");
  myStack.push(10000);
   myStack.peep();
   
   //System.out.println(myStack);
	}

}
