package exceptionprogram;

public class Exex {
public static void main(String args[]) {
	int a=7;
	int b=0;
	try {
	int c=a/b;	
	}
	catch(ArithmeticException c)
	{
	System.out.println("Exception Handling");
	}
	finally
	{
	System.out.println("It is finally")
	}
/*int a[]= {2,3,4,5};
for (int i=0;i<=5;i++) {
	System.out.println(a[i]);
}*/
/*	String s=null;
	System.out.println(s.length());*/ 


}
}
