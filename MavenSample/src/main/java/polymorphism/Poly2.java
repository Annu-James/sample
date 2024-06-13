package polymorphism;

public class Poly2 extends PolymorphismEx{
	public void display()
	{
		super.display("Hai") ;
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Poly2 obj=new Poly2();
obj.display();
	}

}
