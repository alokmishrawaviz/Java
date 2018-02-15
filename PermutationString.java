package Alok.Interview;

public class PermutationString {

	private void Permutation(String s, int i, int j) {
		 
		if (i==j) {
			System.out.println(s);
		} else {

		
		for (int j2 = i; j2 <=j; j2++) {
			
			s=swap(s,i,j2);
			Permutation(s, i+1, j);
		    s=swap(s,i,j2);
		}

		
		}
	}

	private String swap(String s, int i, int j) {
		
       char temp;
       char[] arr=s.toCharArray();
       temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
		return String.valueOf(arr);
	}

	public static void main(String[] args) {
		
		String s="ABCD";
		int LENGTH=s.length();
		
		PermutationString permutation=new PermutationString();
		permutation.Permutation(s,0,LENGTH-1);
	}

}
