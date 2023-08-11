class FactorialCalculator {
    public int calculate(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

class RecursiveFactorialCalculator extends FactorialCalculator {
    @Override
    public int calculate(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculate(n - 1);
    }
}

public class PolymorphismFactorialExample {
    public static void main(String[] args) {
        FactorialCalculator factorialCalculator1 = new FactorialCalculator();
        FactorialCalculator factorialCalculator2 = new RecursiveFactorialCalculator();

        int n = 5;
        
        int result1 = factorialCalculator1.calculate(n);
        int result2 = factorialCalculator2.calculate(n);
        
        System.out.println("Factorial using non-recursive method: " + result1);
        System.out.println("Factorial using recursive method: " + result2);
    }
}
