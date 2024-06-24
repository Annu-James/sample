package collection_arraylist;

import java.util.ArrayList;

public class ArrayList_Addall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList();
		obj.add("Red");
		obj.add("Rose");
		obj.add("Blue");
		obj.add("Green");
		obj.add("Yellow");
		
		ArrayList<String>obj2=new ArrayList();
		obj2.add("Hello");
		obj2.add("java");
		obj.addAll(obj2);
		System.out.println(obj);
	}

}
