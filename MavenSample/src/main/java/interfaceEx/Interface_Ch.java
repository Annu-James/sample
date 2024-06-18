package interfaceEx;

public class Interface_Ch implements Interface_2{
public void add()
{
int x=30;
int y=40;
int z=x+y;
System.out.println(z);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_Ch obj=new Interface_Ch();
		obj.wish();
		obj.num();
		obj.add();
	}

	@Override
	public void wish() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void num() {
		// TODO Auto-generated method stub
		int a=4500;
		System.out.println("Number= "+a);
	}

}
