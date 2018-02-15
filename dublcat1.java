package String;

public class dublcat1 {

		
		
		public static void main(String... args) {
		    int[] array = {0, 1, 2, 3, 5, 6, 7, 9};
		    int duplicate = findDuplicate(array);
		    System.out.println(duplicate);
		}

		private static int findDuplicate(int[] array) {
		    int low = 0;
		    int high = array.length - 1;

		    while (low <= high) {
		        int mid = (low + high) >>> 1;
		        int midVal = array[mid];

		        if (midVal == mid)
		            low = mid + 1;
		        else
		            high = mid - 1;
		    }
		    return high;
		}

	}


