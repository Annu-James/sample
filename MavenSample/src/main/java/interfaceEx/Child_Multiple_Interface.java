package interfaceEx;

public class Child_Multiple_Interface implements Add_Parent,Sub_Parent {
public void multiply()
{
int m=20;
int n=43;
int o=m*n;
System.out.println("Multiplication of 2 numbers= "+o);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_Multiple_Interface obj=new Child_Multiple_Interface();
		obj.add();
		obj.sub();
		obj.multiply();
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a=543;
		int b=476;
		int c=a+b;
		System.out.println("Sum of 2 numbers= "+c);
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int x=894;
		int y=479;
		int z=x-y;
		System.out.println("Sub of 2 numbers= "+z);
	}

}
