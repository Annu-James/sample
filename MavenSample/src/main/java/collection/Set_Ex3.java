package collection;
import java.util.*;
public class Set_Ex3 {//contains()

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String>obj=new LinkedHashSet();
{obj.add("Red");
obj.add("Yellow");
obj.add("Green");
System.out.println(obj);}
boolean a=obj.contains("Yellow");
System.out.println(a);
	}

}
