package calculator;


import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
        CalculatorClass calc = new CalculatorClass();
        Scanner sc = new Scanner(System.in);

        // Step 1: Odd numbers
        calc.productCalculate(1, 10);

        // Step 2: Sum calculations
        calc.sumCalculateDemo();

        // Step 3: Ask to show history
        System.out.print("\nShow calculation history? (yes/no): ");
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("yes")) {
            calc.calculationHistory();
        }

        sc.close();
    }
	
	


}
