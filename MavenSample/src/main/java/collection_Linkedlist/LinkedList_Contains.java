package collection_Linkedlist;

import java.util.LinkedList;

public class LinkedList_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>obj=new LinkedList();
		obj.add("Yellow");
		obj.add("Red");
		obj.add("Green");
		obj.add("Pink");
		obj.add("Blue");
		boolean a=obj.contains("Blue");
		System.out.println(a);
	}

}
