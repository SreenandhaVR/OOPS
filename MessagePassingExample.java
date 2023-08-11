class FactorialCalculator {
    private int number;
    private int result;

    public void setMessage(int num) {
        number = num;
    }

    public void calculateFactorial() {
        if (number < 0) {
            result = -1; // Indicate invalid input
        } else if (number == 0 || number == 1) {
            result = 1;
        } else {
            result = 1;
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
        }
    }

    public int getResult() {
        return result;
    }
}

class MessagePassingExample {
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
        
        int inputNumber = 5;
        calculator.setMessage(inputNumber);
        
        // Message passing: Calculate factorial
        calculator.calculateFactorial();
        
        int factorialResult = calculator.getResult();
        
        if (factorialResult == -1) {
            System.out.println("Invalid input for factorial calculation.");
        } else {
            System.out.println("Factorial of " + inputNumber + " is: " + factorialResult);
        }
    }
}
