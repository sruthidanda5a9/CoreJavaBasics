package Practice;

public class multipleinheritence implements Interface1,Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface1 one = new multipleinheritence();
		Interface2  two = new multipleinheritence();
		one.implementme();
		two.implementme();

	}

	@Override
	public void implementme() {
		// TODO Auto-generated method stub
		System.out.println(" I am implementing here but i dont know i belong to which interface. :(");
	}

}
