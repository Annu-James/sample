package collection;

import java.util.Set;
import java.util.*;

public class Set_Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer>obj=new LinkedHashSet();
obj.add(29);
obj.add(30);
obj.add(31);
obj.add(32);
obj.add(33);
System.out.println(obj);
Iterator nobj=obj.iterator();
while(nobj.hasNext())
{
System.out.println(nobj.next());	
}

	
	}

}
