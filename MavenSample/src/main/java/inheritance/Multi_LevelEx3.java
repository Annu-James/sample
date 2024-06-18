package inheritance;

public class Multi_LevelEx3 extends Multi_LevelEx2{
public void multiply()
{
int m=54;
int n=34;
int o=m*n;
System.out.println("Multiplication of 2 numbers= "+o);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi_LevelEx3 obj=new Multi_LevelEx3();
		obj.add(30, 100);
		obj.sub(450, 67);
	    obj.multiply();
	}

}
