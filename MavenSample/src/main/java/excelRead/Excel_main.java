package excelRead;

import java.io.IOException;

public class Excel_main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String ab=Excel_Sample.getStringData(3, 0);
System.out.print(ab+" ");
String cd=Excel_Sample.getIntegerData(3, 1);
System.out.print(cd);
	}

}
