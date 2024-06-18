package inheritance;

public class Inheritance_H3 extends Inheritance_Hier1 {
	public void multiply()
	{
		int m=10;
		int n=5;
		int o=m*n;
		System.out.println(o);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Inheritance_H3 obj= new Inheritance_H3();
obj.multiply();
obj.add();
	}

}
