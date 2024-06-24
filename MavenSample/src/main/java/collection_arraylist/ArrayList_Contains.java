package collection_arraylist;

import java.util.ArrayList;

public class ArrayList_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList();
		obj.add("Red");
		obj.add("Rose");
		obj.add("Blue");
		obj.add("Green");
		obj.add("Yellow");
		boolean a=obj.contains("Green");
		System.out.println(a);
		boolean b=obj.contains("Pink");
		System.out.println(b);
	}

}
