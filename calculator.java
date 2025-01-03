package ArithmeticCalculator;
import java.util.*;

public class calculator {
    // function to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // function to subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }

    // function to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // function to divide two numbers
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        } else {
            return a / b;
        }
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static double squareRoot(double a) {
        if(a<0){
            throw new ArithmeticException("Square root of negative number is not allowed.");
        }
        return Math.sqrt(a);
    }

    public static double cubeRoot(double a) {
        return Math.cbrt(a);
    }

    public static double log(double a) {
        if(a<=0){
            throw new ArithmeticException("Logarithm of non-positive number is not allowed.");
        }
        return Math.log(a);
    }

    public static double factorial(double a) {
        if(a<0){
            throw new ArithmeticException("Factorial of negative number is not allowed.");
        }
        double result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public static double absolute(double a) {
        return Math.abs(a);
    }

    public static double round(double a) {
        return Math.round(a);
    }

    public static double ceil(double a) {
        return Math.ceil(a);
    }

    public static double floor(double a) {
        return Math.floor(a);
    }

    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    public static double min(double a, double b) {
        return Math.min(a, b);
    }

    public static double random() {
        return Math.random();
    }

    public static double sin(double a) {
        return Math.sin(a);
    }

    public static double cos(double a) {
        return Math.cos(a);
    }

    public static double tan(double a) {
        return Math.tan(a);
    }

    public static double asin(double a) {
        return Math.asin(a);
    }

    public static double acos(double a) {
        return Math.acos(a);
    }

    public static double atan(double a) {
        return Math.atan(a);
    }

    public static double sinh(double a) {
        return Math.sinh(a);
    }

    public static double cosh(double a) {
        return Math.cosh(a);
    }

    public static double tanh(double a) {
        return Math.tanh(a);
    }

    public static double toRadians(double a) {
        return Math.toRadians(a);
    }

    public static double toDegrees(double a) {
        return Math.toDegrees(a);
    }

    public static double hypot(double a, double b) {
        return Math.hypot(a, b);
    }

    public static double exp(double a) {
        return Math.exp(a);
    }

    public static double log10(double a) {
        return Math.log10(a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            // loop to keep the calculator running
            while (true) {
                System.out.println("Enter an expression (e.g. 1+2): ");
                String input = in.nextLine();

                // Use regex to split the input into operands and operator
                String[] parts = input.split("(?<=[-+*/])|(?=[-+*/])");

                // validate input
                if (parts.length != 3) {
                    System.err.println("Error! Input a correct expression.");
                    continue;
                }

                // extract operands and operator
                String A = parts[0];
                String operator = parts[1];
                String B = parts[2];

                // convert operands to double
                double a = Double.parseDouble(A);
                double b = Double.parseDouble(B);
                double result = 0.0;

                // validate operator
                if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
                    System.err.println("Error! Input a correct operator.");
                    continue;
                }

                // perform the operation
                try {
                    switch (operator) {
                        case "+":
                            result = add(a, b);
                            break;
                        case "-":
                            result = subtract(a, b);
                            break;
                        case "*":
                            result = multiply(a, b);
                            break;
                        case "/":
                            result = divide(a, b);
                            break;
                    }
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.err.println(e.getMessage());
                }
            }
        } catch (Exception e) {
            System.err.println("Error! Input a correct expression.");
        } finally {
            in.close();
        }
    }
}