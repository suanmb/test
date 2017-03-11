package baseforjava;

import java.util.*;

public class GenericTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List list=new ArrayList();
//		list.add(10);
//		list.add("string");
//		list.add(10.11111);
//		for(int i=0;i<list.size();i++)
//			System.out.println(list.get(i));
		
		
		
		//使用泛型
		List <String> list=new ArrayList<String>();
		list.add("string1");
		list.add("string2");
		//list.add(10);
		for(int i=0;i<list.size();i++){
			String name = list.get(i);
			System.out.println("name...d.....:"+name);
		}
	}

}
