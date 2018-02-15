abstract class Bike{
	abstract void run();
}
	
class DecimalToBin extends Bike {
       void run(){
    	   System.out.println("run sefly...");
       }
	/*public static void binary(int n){
		int i=0;
		int[] arr=new int[40];
		while(n>0){
			arr[i++]=n%2;
			n=n/2;
		
		}
		for(int j=i-1;j>=0;j--){
			System.out.print(arr[j]);
		}
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /* System.out.println("Enter the decimal number...");
  binary(10);*/
		Bike bk=new DecimalToBin();
		bk.run();
	}

}
