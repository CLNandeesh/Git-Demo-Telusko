interface Int {
	//@FunctionalInterface
	void disp();
}

public class FunctionalInterfaceWithLambdaExp {

	public static void main(String[] args) {
		
		Int i=()->System.out.println("SHOW");
		
		i.disp();

	}

}
