package calculator;

public class ProductCalculatorClass {

	public String productCalculate(int a, int b) {
        StringBuilder result = new StringBuilder("Odd numbers from " + a + " to " + b + ": ");
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }
}
