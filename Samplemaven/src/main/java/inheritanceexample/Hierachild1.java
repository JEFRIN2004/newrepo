package inheritanceexample;

public class Hierachild1 extends Hieraparent {
	public void show1()
	{
		System.out.println("this is child1");
	}
	
	
public static void main (String args[]) {
	Hierachild1 obj=new Hierachild1();
	obj.show1();
	obj.show();
}
}

	


