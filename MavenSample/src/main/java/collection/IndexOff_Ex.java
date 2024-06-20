package collection;
import java.util.ArrayList;

import java.util.List;
public class IndexOff_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>obj=new ArrayList();
{
obj.add(9);
obj.add(3);
obj.add(7);
obj.add(4);
obj.add(7);

int fo=obj.indexOf(7);// first occurance
System.out.println(fo);
int lo=obj.lastIndexOf(7);//last occurance
System.out.println(lo);
}}

}
