package collection;
import java.util.*;
public class Set_Ex4 {//remove

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer>obj=new LinkedHashSet();
obj.add(10);
obj.add(20);
obj.add(30);
obj.add(40);
System.out.println(obj);
obj.remove(20);
System.out.println(obj);
	}

}
