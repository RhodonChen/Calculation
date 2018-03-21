package calculation;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insert first number:");
		double a = s.nextDouble();s.nextLine();
		System.out.println("Insert the operator:");
		String op = s.nextLine();
		System.out.println("Insert second number:");
		double b = s.nextDouble();
		
		Operation o = Operation.parseOperator(op);
		if(o == null) {
			System.err.println("Operator non recognized");
		}
		else {
			o.setNumber(a, b);
			System.out.println("Result of" + o.getName() + "is" +o.calc());
		}
		s.close();
	}

}
