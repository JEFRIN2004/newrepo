package stringprogram;

public class Samplestring {

	public static void main(String[] args) {

		String s1=new String("Crazzy");
		String s2=new String("Crazzy");
		System.out.println(s1 +s2);
		char ch[]= {'A','B','C'};
		String s5=new String(ch);
		System.out.println(s5);
		//length ()
		System.out.println(s1.length());
		//concat()
		System.out.println(s1.concat(s2));
		//touppercase()
		System.out.println(s1.toUpperCase());
		//lowercase()
		System.out.println(s1.toLowerCase());
		String s6="java";
		String s7="java";
		String s8="Java";
		String s9="selenium";
		System.out.println(s6.equals(s7));
		//equalsignorecase()
		System.out.println(s6.equalsIgnoreCase(s8));
		//isEmpty()
		System.out.println(s1.isEmpty());
		int h=10;
		String s10="";
		System.out.println(s10.isEmpty());
		//valueof()
		int a=5;
		String s11="";
		System.out.println(s11.valueOf(a));
		
		

	}

}
