package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution1 {   
	public static void main(String[] args) {       
		Scanner in = new Scanner(System.in);        
		String month = in.next();        
		String day = in.next();       
		String year = in.next();
		
		int nmonth = Integer.parseInt(month);       
		int nday = Integer.parseInt(day);        
		int nyear = Integer.parseInt(year);
		
		Calendar calender=Calendar.getInstance();		
		calender.set(Calendar.YEAR, nyear);		
		calender.set(Calendar.MONTH, nmonth-1);		
		calender.set(Calendar.DATE, nday);	
	
		int days=calender.get(Calendar.DAY_OF_WEEK);
		                   
		switch (days) {		
		case 1:System.out.println("SUNDAY");						
		break;		
		case 2:System.out.println("MONDAY");				
		break;		
		case 3:System.out.println("TUESDAY");				
		break;		
		case 4:System.out.println("WEDNESDAY");				
		break;		
		case 5:System.out.println("THURSDAY");				
		break;		
		
		case 6:System.out.println("FRIDAY");				
		break;		
		case 7:System.out.println("SATURDAY");				
		break;		default:			
			break;		}	}   
	
}