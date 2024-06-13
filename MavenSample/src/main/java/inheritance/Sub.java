package inheritance;

public class Sub extends SingleP_Ex {//child of SingleP_Ex
	public void numbersub()
	{
		int x=50;
		int y=20;
		int z=x-y;
		System.out.println(z);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub obj=new Sub();
		obj.numbersub();
        obj.number();
	}

}
