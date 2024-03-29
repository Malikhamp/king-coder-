package lambdas;

public class MathTest {

	public static void main(String[] args) {
		MathTest tester = new MathTest();
		//W/ type declaration
		MathOperation addition = (int a, int b) -> a + b;
		//W/o type declaration
		MathOperation subtraction = (a,b) -> a-b;
		//w/ return statement along curly braces
		MathOperation multiplication = (int a, int b) -> {return a*b;};
		//W/o return statement and w/o curly braces
		MathOperation division =(int a, int b) -> a/b;
		
		
		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));

	}

	private int operate(int a, int b, MathOperation mathOperation) {
		// TODO Auto-generated method stub
		return mathOperation.operation(a,b);
	}

}
