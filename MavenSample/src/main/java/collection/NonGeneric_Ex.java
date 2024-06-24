package collection;
import java.util.*;
public class NonGeneric_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List obj=new ArrayList();
{
obj.add(4);
obj.add("Car");
obj.add(4.56);
obj.add('Z');
obj.add(4);
System.out.println(obj);
}
System.out.println(obj.contains("Car"));
System.out.println(obj.get(3));
System.out.println(obj.set(2, 3.5));
System.out.println(obj.remove(3));
int fo=obj.indexOf(4);
System.out.println(fo);
int lo=obj.lastIndexOf(4);
System.out.println(lo);
	}

}
