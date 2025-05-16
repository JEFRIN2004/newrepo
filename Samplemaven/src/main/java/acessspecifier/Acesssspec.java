package acessspecifier;

public class Acesssspec 
{
	public void pubemethod()
	{
		System.out.println("this is a public method");
	}
	private void primethod()
	{
		System.out.println("this is a private method");
	}
	protected void promethod()
	{
		System.out.println("this is a protected method");
	}
	void defmethod()
	{
		System.out.println("this is a default method");
	}

	public static void main(String[] args) {
		Acesssspec obj=new Acesssspec();
		obj.pubemethod();
		obj.primethod();
		obj.promethod();
		obj.defmethod();
	}
	
		// TODO Auto-generated method stub
		
	
		
		// TODO Auto-generated method stub

	}


