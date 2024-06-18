package abstraction;

public class Abstraction2_17_6 extends Abstraction17_6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction2_17_6 obj=new Abstraction2_17_6();
		obj.add();
		obj.multiply();
	}

	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		int x=45;
		int y=32;
		int z=x*y;
		System.out.println("Multiplication of 2 numbers= "+z);
	}

}
