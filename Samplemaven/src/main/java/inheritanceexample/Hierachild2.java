package inheritanceexample;

public class Hierachild2 extends Hieraparent{
	public void show2()
	{
		System.out.println("this is child2");
	}

	public static void main(String[] args) {
		Hierachild2 obj=new Hierachild2();
		obj.show();
		obj.show2();
		// TODO Auto-generated method stub

	}

}
