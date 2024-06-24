package collection_Linkedlist;
import java.util.LinkedList;
public class LinkedList_Addall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>obj=new LinkedList();
		obj.add("Yellow");
		obj.add("Red");
		obj.add("Green");
		obj.add("Pink");
		obj.add("Blue");
		LinkedList<String>obj2=new LinkedList();
		obj2.add("Hello");
		obj2.add("Java");
		obj.addAll(obj2);
		System.out.println(obj);
		
	}

}
