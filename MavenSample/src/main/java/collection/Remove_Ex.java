package collection;
import java.util.List;
import java.util.ArrayList;
public class Remove_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>obj=new ArrayList();
obj.add("Red");
obj.add("Yellow");
obj.add("Rose");
obj.add("blue");
obj.add("Green");
obj.remove(2);//index num
System.out.println(obj);
obj.remove("blue");//colour
System.out.println(obj);
	}

}
