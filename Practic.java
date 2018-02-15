
public class Practic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int i=1;i<=5;i++){
			int t=1;
			for(int j=1;j<=i;j++){
				System.out.print(t+" ");
				t++;
			}
			System.out.println("\n");
			
		}

	}
*/
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				if((i+j)%2==0){
					System.out.print("1"+" ");
				}else
					System.out.print("0"+" ");
			}
			System.out.println("\n");
		}
	}
}
