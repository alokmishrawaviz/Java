
public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        printNumber(1);
        }
		public static void printNumber(int number){
			if(number<=100){
				System.out.println("Alok");
				number++;
				printNumber(number);
			}else{
				System.exit(0);
			}
		}
	}


