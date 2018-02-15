package alok;

import java.util.Arrays;

public class MissingArrayElement {

	public static void main(String[] args) {
		 int[] iArray = new int[]{1, 2, 3, 4,5,7};
	        int missing = getMissingNumber(iArray, 7);
	        System.out.printf("Missing number in array %s is %d %n",Arrays.toString(iArray), missing); 

	}
	        private static int getMissingNumber(int[] numbers, int totalCount) {
	        	int expectedSum = totalCount * ((totalCount + 1) / 2); 
	        	int actualSum = 0; 
	        	for (int i : numbers) { 
	        		actualSum += i; 
	        		} 
	        	return expectedSum - actualSum; 
	        	}

	      //  Read more: http://javarevisited.blogspot.com/2014/11/how-to-find-missing-number-on-integer-array-java.html#ixzz4pX7EzF7W

	}


