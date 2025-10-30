package calculator;

import java.util.ArrayList;

public class CalculatorClass {

	private ArrayList<String> history = new ArrayList<>();
    private ProductCalculatorClass productCalc = new ProductCalculatorClass();
    private SumCalculatorClass sumCalc = new SumCalculatorClass();

    public void productCalculate(int a, int b) {
        String result = productCalc.productCalculate(a, b);
        System.out.println(result);
        history.add(result);
    }

    public void sumCalculateDemo() {
        int sum2 = sumCalc.sumCalculate(5, 10);
        int sum3 = sumCalc.sumCalculate(2, 3, 4);
        int sum4 = sumCalc.sumCalculate(1, 2, 3, 4);

        System.out.println("Sum of 2 numbers: " + sum2);
        System.out.println("Sum of 3 numbers: " + sum3);
        System.out.println("Sum of 4 numbers: " + sum4);

        history.add("Sum of 2 numbers: " + sum2);
        history.add("Sum of 3 numbers: " + sum3);
        history.add("Sum of 4 numbers: " + sum4);
    }

    public void calculationHistory() {
        System.out.println("\n=== Calculation History ===");
        for (String record : history) {
            System.out.println(record);
        }
    }
}
