interface Demo1 {
	//@FunctionalInterface
	int add(int a, int b);
}

public class LambdaExp2 {

	public static void main(String[] args) {

		Demo1 d = (a, b) -> a + b;
		
		System.out.println(d.add(22, 33));

	}

}
