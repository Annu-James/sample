package superExample;

public class SuperM2 extends SuperM{
public void sub()
{
int x=60;
int y=30;
int z=x-y;
System.out.println(z);
super.add();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperM2 obj=new SuperM2();
obj.sub();
	}

}
