
public class Print1to100Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(int i=1100;i<=1200;i++){
    	boolean flag=true;
    	for(int j=2;j<i-1;j++){
    		if(i%j==0){
              	flag=false;
            }
    	}
    	
    	if(flag==true){
    		System.out.print(i);
    		System.out.print("\t");
    	}
    }
    
	}

}
