package in.co.rays.Collection;

import java.util.ArrayList;

public class Generics {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	list.add(45);
	list.add(85);
	list.add(35);
	list.add(25);
	list.add(15);
//	list.add("harry");//compilation error of generics 
	System.out.println(list);

}
}
