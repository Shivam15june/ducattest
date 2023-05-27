package arraydemo;

import java.util.ArrayList;

public class listdemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(10);
		list.add(14);
		list.add(19);
		System.out.println(list.size());
		System.out.println("********************");
		list.add(5);
		list.add(10);
		list.add(14);
		list.add(19);
		System.out.println("********************");
		System.out.println(list.size());
		System.out.println("********************");
		System.out.println(list);
		System.out.println("********************");

		for (Integer ele : list) {
			System.out.println(ele);
		}

	}

}
