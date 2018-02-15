package com.collection.alok;

import java.util.ArrayList;

class A {}
class B extends A{}
class C extends A{}
interface S{}
class E implements S{}
class T extends E{}
class Y extends T{}




public class WildCard {
	//static void print(ArrayList<? extends A> list){
	static void print(ArrayList<? extends S> list){}
		//static void print(ArrayList<? super B> list){
	//static void print(ArrayList<Object> list){}
	//static void print(ArrayList<?> list){}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  A obj=new B();
  A [] var={new B(),new C()};
  // ArrayList<A> l1=new ArrayList<>();
 // print(l1);
  Object temp="alok";
  temp=11;
 // print(temp);
  ArrayList<S> l2=new ArrayList<>();
  print(l2);
  ArrayList<B> l3=new ArrayList<>();
	
	

	}
	}
