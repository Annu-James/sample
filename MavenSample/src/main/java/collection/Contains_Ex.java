package collection;

import java.util.ArrayList;
import java.util.List;

public class Contains_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj=new ArrayList();
		obj.add("Red");
		obj.add("Yellow");
		obj.add("Rose");
		obj.add("blue");
		obj.add("Green");
		boolean a=obj.contains("Red");
		System.out.println(a);
			}
	}

