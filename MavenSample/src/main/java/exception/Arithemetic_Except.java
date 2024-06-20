package exception;

public class Arithemetic_Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
int a=40;
int b=0;
int c=a/b;
System.out.println(c);
}
/*catch(ArithmeticException x)
{
System.out.println("An Exception is in your code"+x);	
}*/
finally
{
System.out.println("Program analysis is completed");	
}
	}

}
