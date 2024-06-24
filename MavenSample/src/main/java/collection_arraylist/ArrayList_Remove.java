package collection_arraylist;

import java.util.ArrayList;

public class ArrayList_Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList();
		obj.add("Red");
		obj.add("Rose");
		obj.add("Blue");
		obj.add("Green");
		obj.add("Yellow");
		obj.remove(1);//remove using index no
		obj.remove("Blue");//remove using value
		System.out.println(obj);
	}

}
