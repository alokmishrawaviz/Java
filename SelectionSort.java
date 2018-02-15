
public class SelectionSort {
 public static void selectionSort( int arr[]){
	 for(int i=0;i<arr.length-1;i++){
		 int index=i;
		  for(int j=i+1;j<arr.length;j++)
		  {
			  if(arr[j]<arr[index]){
				index=j;  
			  }
			  int smallestNumber=arr[index];
			  arr[index]=arr[i];
			  arr[i] = smallestNumber;
		  }
	 }
 }

 public static void main(String[] args){
	SelectionSort ss=new SelectionSort();
	int [] arr={11,2,8,3,5,4};
	for(int i=0;i<arr.length-1;i++){
		//System.out.print(arr[i]+"");
	}
	
	ss.selectionSort(arr);
	for(int j=0;j<arr.length-1;j++){
		System.out.print(arr[j] + "  ");
	}
 }
}