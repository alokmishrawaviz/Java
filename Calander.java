package hackerrank;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
public class Calander {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        Calendar cal = Calendar.getInstance();
        
        cal.set(month,day,year);
        switch(cal.get(cal.DAY_OF_WEEK))
            {
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
            break;
        }
    }
}