package collectionex;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistex {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
	a.add("green");
	a.add("blue");
	a.add("red");
	System.out.println(a);
	ArrayList<String> b=new ArrayList<String>();
	b.add("yamaha");
	b.add("bajaj");
	b.add("tvs");
	System.out.println(b);
	//addAll
	System.out.println(a.addAll(b));
	System.out.println(a);
	//containsAll
	System.out.println(a.containsAll(b));
	Iterator<String> c=a.iterator();
	while(c.hasNext())
	{
		System.out.println(c.next());
		
	}
	c.remove();
	System.out.println(a);
		
	}
	

	}


