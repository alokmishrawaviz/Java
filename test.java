package com.collection.alok;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class test {
public static  void mian(String args[]) throws ScriptException {
	// TODO Auto-generated method stub
 
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	String S=sc.next();
	
	if(1 <= T && T <= 10000){
		String ab=sc.nextLine();
		ScriptEngineManager man=new ScriptEngineManager();
		ScriptEngine en=man.getEngineByName("js");
		Object b=en.eval(ab);
		System.out.println(b);
		
	}
}
}
