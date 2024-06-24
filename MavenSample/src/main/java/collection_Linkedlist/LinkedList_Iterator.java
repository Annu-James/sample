package collection_Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>obj=new LinkedList();
		obj.add("Yellow");
		obj.add("Red");
		obj.add("Green");
		obj.add("Pink");
		obj.add("Blue");
		Iterator<String>a=obj.iterator();
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
	}

}
