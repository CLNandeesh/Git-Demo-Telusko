interface I {
	void show();

}

public class AnonICWithInterface {

	public static void main(String[] args) {

		I i = new I() {
			public void show() {
				System.out.println("SHOW");
			}
		};
		
		i.show();

	}

}
