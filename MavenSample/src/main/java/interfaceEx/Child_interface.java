package interfaceEx;

public class Child_interface implements Sample_Interface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_interface obj=new Child_interface();
		obj.add();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println(a);
	}

}
