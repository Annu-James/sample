package inheritance;

public class Multi_Inheritance3 extends Multi_Inheritance2{
public void multiply()
{
int m=10;
int n=3;
int o=m*n;
System.out.println(o);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi_Inheritance3 obj=new Multi_Inheritance3();
		obj.multiply();
		obj.sub();
		obj.add();

	}

}
