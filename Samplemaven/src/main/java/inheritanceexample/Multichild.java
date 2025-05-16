package inheritanceexample;

public class Multichild extends Multiinter{
	public void show3()
	{
	
		System.out.println("this is a childclass");
	}
	
	public static void main(String args[])
	{
		Multichild obj=new Multichild();
		obj.show1();
		obj.show2();
		obj.show3();
		
	}
}
	



