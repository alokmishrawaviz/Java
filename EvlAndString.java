package com.collection.alok;

import java.util.ArrayList;
import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class EvlAndString 
{
public static void main(java.lang.String[] args) throws ScriptException  
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		ArrayList abb=new ArrayList<>();
		for(int i=0;i<T;i++){
		if(0<T && T <= 1000)
		{
			String ab=sc.nextLine();
			if(ab.length()<2 && ab.length()>=1000000)
			return;
			
			ScriptEngineManager man=new ScriptEngineManager();
			ScriptEngine en=man.getEngineByName("js");
			Object b=en.eval(ab);
			if(b.toString().equals("NaN") || b.toString().equals("Infinity"))
			{
				abb.add("Division by zero encountered");
			}
			else
			{
				abb.add(b);
			}
		}
		} 
		for(Object b: abb)
		{
	     System.out.println(b);
        }
		 }
	}