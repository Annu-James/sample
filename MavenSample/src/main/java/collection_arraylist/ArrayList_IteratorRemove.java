package collection_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_IteratorRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList();
		obj.add("Red");
		obj.add("Rose");
		obj.add("Blue");
		obj.add("Green");
		obj.add("Yellow");
		Iterator<String>a=obj.iterator();
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
		a.remove();
		System.out.println(obj);
		
}

}
