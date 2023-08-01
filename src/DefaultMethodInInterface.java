interface Appu {
	default void show() {
		System.out.println("APPU Show");
	}

	void display();
}

interface Shivu {
	default void show() {
		System.out.println("Shivu Show");
	}
}

class Raj implements Appu, Shivu {
	public void show() {
		//System.out.println("Raj Show");
		Appu.super.show();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
}

public class DefaultMethodInInterface {

	public static void main(String[] args) {
           Raj raj=new Raj();
           raj.show();
	}

}
