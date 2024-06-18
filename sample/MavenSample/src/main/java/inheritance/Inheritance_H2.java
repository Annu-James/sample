package inheritance;

public class Inheritance_H2 extends Inheritance_Hier1 {
public void sub()
{
int x=40;
int y=30;
int z=x-y;
System.out.println(z);
}
public static void main(String[] args)
{
Inheritance_H2 obj=new Inheritance_H2();
obj.sub();
obj.add();
}
}
