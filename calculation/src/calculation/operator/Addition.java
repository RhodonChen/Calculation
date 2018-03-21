package calculation.operator;

public class Addition extends Operation{

	public String getName() {
		return "addition";
	}
	
	public String getOperator() {
		return "+";
	}
	
	public double calc() {
		return a + b;
	}
}
