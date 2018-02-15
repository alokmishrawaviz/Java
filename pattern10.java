
public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=5;i>=1;i--){
			
				if(k<4){
					for(int j=1;j<=i;j++){
				System.out.print(k);
					}
					System.out.println("\n");
				k++;
				}else{
					k--;
				for(int j=1;j<=i;j++){
					
					System.out.print(k-1);
					}
					System.out.println("\n");
					
				}
				System.out.println("\n");
			}
		}

	}


