package tasksCoreJava;

public class DanielAmberApples {

	public int addApples(int a, int b) {
		return a + b;
	}

	public double addApples(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {

		DanielAmberApples apples = new DanielAmberApples();

		System.out.println("Addition of apples : " + apples.addApples(3, 2));
		System.out.println("Addition of apples : " + apples.addApples(3.5, 2.5));

	}

}
