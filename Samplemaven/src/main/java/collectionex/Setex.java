package collectionex;

import java.util.HashSet;
import java.util.Set;

public class Setex {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("mustang");
		s.add("porsche");
		s.add("supra");
		s.add("civic");
		System.out.println(s);
		// TODO Auto-generated method stub
		Set<String> c=new HashSet<String>();
		c.add("curve");
		c.add("punch");
		c.add("harrier");
		c.add("nexon");
		System.out.println(c);
		s.addAll(c);
		System.out.println(s);
		
		System.out.println(s.contains("civic"));
		System.out.println(s.containsAll(c));
		s.remove("civic");
		System.out.println(s);
		
		// TODO Auto-generated method stub

	}

}
