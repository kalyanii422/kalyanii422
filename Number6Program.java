package tasksCoreJava;

public class Number6Program {

	public boolean number6Prog(int a, int b) {
		int sum = a + b;
		int diff = Math.abs(a-b);
		return (a == 6 || b ==6 || sum==6 || diff == 6) ? true:false;
		}
	
	public static void main(String[] args) {

		Number6Program numProg = new Number6Program();
		
		System.out.println("Number 6 output : "+ numProg.number6Prog(6,4));
		System.out.println("Number 6 output : "+ numProg.number6Prog(7,3));
		System.out.println("Number 6 output : "+ numProg.number6Prog(2,5));
	}

}
