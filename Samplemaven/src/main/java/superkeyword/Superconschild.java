package superkeyword;

public class Superconschild extends Superconsparent {
	public  Superconschild()
	{
		super(3,5);
	System.out.println("this is a child cons");

	}
	public Superconschild(int a,int b)
	{
	super(3454.8f);
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Superconschild obj=new Superconschild();
		//Superconsparent obj1=new Superconsparent();
		Superconschild obj2=new Superconschild(7,8);
		// TODO Auto-generated method stub

	}

}
