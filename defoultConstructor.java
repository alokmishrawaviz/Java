class O{
	public O(String s){
		System.out.println("Defoult");
	}
}
class Sub extends O{
	public Sub(String s){
		super(s);
		System.out.println(s);
	}
}
public class defoultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Sub obj=new Sub("Alok");
	}

}
