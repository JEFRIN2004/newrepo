package collectionex;

import java.util.ArrayList;
import java.util.List;

public class Excollect {

	public static void main(String[] args) {
		List< String> li=new ArrayList<String>();
		li.add("green");
		li.add("blue");
		li.add("red");
		System.out.println(li);
		//get
		System.out.println(li.get(2));
		//remove
		System.out.println(li.remove(0));
		System.out.println(li);
		//size
		System.out.println(li.size());
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		
			
		}
		for(String color:li)
			System.out.println(color);
		// TODO Auto-generated method stub

	}

}
