package superExample;

public class SuperKey2 extends SuperKey1 {
String a="Yellow";

public void display()
{
System.out.println(a);	
System.out.println(super.a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperKey2 obj=new SuperKey2();
obj.display();
	}

}
