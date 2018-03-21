package calculation;

public class Multiplication extends Operation{

	public String getName() {
		return "multiplication";
	}
	
	public String getOperator() {
		return "*";
	}
	
	public double calc() {
		return a * b;
	}
}
