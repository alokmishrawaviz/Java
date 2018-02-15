package alok;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Sorting  {
	 static Scanner sc = new Scanner(System.in);
	 public static String reverseOf(String s4){
		 char c4[] = s4.toCharArray();
		 char cr4[] = new char[50];
		int length1= c4.length;
		for(int i=(length1-1);i>=0;i--){
			cr4[(length1-1)-i]=c4[i];
		}
		return new String(cr4);
	    }
public static void main(String []arr){
	String s5=null;
	int mid=0;
	String word=null;
	TreeSet<String> tset =new TreeSet<>();
	
	String text = sc.next();
		char c[]= text.toCharArray();
	    int len = c.length;
	    if(len%2==0){
	    	mid=len/2;
	    word =text.substring(0,mid);	
	    }
	    else
	    {
	 mid =(((len+1)/2));
	
	//String midValue = String.valueOf(c[mid-1]);
	 word = text.substring(0 , mid-1);
	    }
	    String midValue = String.valueOf(c[mid-1]);
	    
	ArrayList<Integer> indices = new ArrayList<>();
	ArrayList<String> permutations = Sorting.getPermutations(word,indices);
	for(String s3 : permutations){
		String s4 = Sorting.reverseOf(s3);
		if(len%2==0){
			 s5 = s3.concat(s4);
		}
		else
		 s5 = (s3.concat(midValue)).concat(s4);
		
		tset.add(s5);
	}
		for(String str : tset){
		System.out.println(str);
	}
}
	public static ArrayList<String> getPermutations(String word , ArrayList<Integer> indices){
		int length = word.length();
		ArrayList<String> toReturn = new ArrayList<String>();
		if(indices.size()==length){
			toReturn.add("");
			return toReturn;
		}
		for (int i = 0;i<length ; i++){
			if(indices.contains(i))
				continue;
			ArrayList<Integer> newIndices = new ArrayList<>();
			for(int index:indices){
				newIndices.add(index);
			}
			newIndices.add(i);
			ArrayList<String>permutations=Sorting.getPermutations(word, newIndices);
			for(String str : permutations){
				toReturn.add(word.charAt(i)+str);
			}
		}
		return toReturn;
	}

	}
