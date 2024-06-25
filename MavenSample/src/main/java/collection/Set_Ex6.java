package collection;
import java.util.*;
public class Set_Ex6 {//hash Code

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer>obj=new LinkedHashSet();
obj.add(20);
obj.add(30);
obj.add(50);
obj.add(40);
System.out.println(obj);
System.out.println(obj.hashCode());
	}

}
