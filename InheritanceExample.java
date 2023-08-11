class MathOperations {
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

class FactorialCalculator extends MathOperations {
  @Override
    public int factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1; 
        } else {
            return super.factorial(n); 
        }
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();

        int num = 5;
        int result = calculator.factorial(num);

        if (result != -1) {
            System.out.println("Factorial of " + num + " is: " + result);
        }
    }
}
