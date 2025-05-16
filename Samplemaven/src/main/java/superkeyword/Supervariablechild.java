package superkeyword;

public class Supervariablechild extends Supervariableparent {
	String color="blue";
	

		// TODO Auto-generated method stub
public void show() {
	System.out.println(color);
	System.out.println(super.color);
}
	


	public static void main(String[] args) {
		Supervariablechild obj=new Supervariablechild();
		//System.out.println(obj.color);
		obj.show();
				
		// to-generated method stub

	}

}
