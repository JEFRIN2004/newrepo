package superkeyword;

public class Supeermethodchild extends Supermethodparent {
	public void show1() {
		this.display();
		super.sum(5,7);
		super.show();
		System.out.println("childclass");
	
	}
	public void display() {
		System.out.println("super");
	}

	public static void main(String[] args) {
		Supeermethodchild obj=new Supeermethodchild();
		//obj.show();
		obj.show1();
		
		// TODO Auto-generated method stub

	}

}
