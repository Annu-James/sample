package collection;

import java.util.ArrayList;
import java.util.List;

public class Generic_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj=new ArrayList();
		{
			obj.add("Red");
			obj.add("Yellow");
			obj.add("Blue");
			System.out.println(obj);
		}
		obj.set(1, "Rose");
		System.out.println(obj);
			}
	}


