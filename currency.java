package hackerrank;

import java.util.*;
import java.text.*;

public class currency {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        
        System.out.println("US: " + NumberFormat.getCurrencyInstance(new Locale("en", "us")));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("in", "india")));
        System.out.println("China: " +NumberFormat.getCurrencyInstance(new Locale("chn", "china")));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(new Locale("fr", "france")));
    }
}
