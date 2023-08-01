interface Demo2 {
	
	
	void disp();
}

public class Lambda3 {

	public static void main(String[] args) {

		Demo2 d = () -> System.out.println("Hai");
		System.out.println("Bai");
		
		d.disp();

	}

}
