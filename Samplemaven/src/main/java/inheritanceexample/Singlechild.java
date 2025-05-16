package inheritanceexample;

public class Singlechild extends Singleparent {
	public void show1()
	{
		System.out.println("this is a child class");
	}
	public static void main(String args[]) {
	Singlechild obj=new Singlechild();
	obj.show1();
	obj.show();
	
	
	}
}
