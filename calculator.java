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

    // function to calculate power of a number
    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    //function to calculate square root of a number
    public static double squareRoot(double a) {
        if(a<0){
            throw new ArithmeticException("Square root of negative number is not allowed.");
        }
        return Math.sqrt(a);
    }

    //function to calculate cube root of a number
    public static double cubeRoot(double a) {
        return Math.cbrt(a);
    }

    //function to calculate log of a number
    public static double log(double a) {
        if(a<=0){
            throw new ArithmeticException("Logarithm of non-positive number is not allowed.");
        }
        return Math.log(a);
    }

    //function to calculate factorial of a number
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

    //function to calculate absolute value of a number
    public static double absolute(double a) {
        return Math.abs(a);
    }

    //function to calculate round of a number
    public static double round(double a) {
        return Math.round(a);
    }

    //function to calculate ceil of a number
    public static double ceil(double a) {
        return Math.ceil(a);
    }

    //function to calculate floor of a number
    public static double floor(double a) {
        return Math.floor(a);
    }

    //function to calculate max of two numbers
    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    //function to calculate min of two numbers
    public static double min(double a, double b) {
        return Math.min(a, b);
    }

    //function to calculate random number
    public static double random() {
        return Math.random();
    }

    //functions to calculate trigonometric functions
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
                System.out.println("Enter an expression (e.g. 1+2 or sin(30)): ");
                String input = in.nextLine();

                // Use regex to split the input into operands and operator
                String[] parts = input.split("(?<=[-+*/^()])|(?=[-+*/^()])");

                // validate input
                if (parts.length < 2) {
                    System.err.println("Error! Input a correct expression.");
                    continue;
                }

                // extract operands and operator
                String operator = parts[0];
                String A = parts.length > 1 ? parts[1] : "0";
                String B = parts.length > 2 ? parts[2] : "0";

                // convert operands to double
                double a = Double.parseDouble(A);
                double b = parts.length > 2 ? Double.parseDouble(B) : 0;
                double result = 0.0;

                // validate operator
                if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/") && !operator.equals("asin") 
                && !operator.equals("atan") && !operator.equals("cosh") && !operator.equals("toRadians") && !operator.equals("hypot") 
                && !operator.equals("log10") && !operator.equals("cos") && !operator.equals("tan") && !operator.equals("sin") && !operator.equals("acos") 
                && !operator.equals("sinh") && !operator.equals("tanh") && !operator.equals("toDegrees") && !operator.equals("exp") && !operator.equals("sqrt") 
                && !operator.equals("cbrt") && !operator.equals("log") && !operator.equals("fact") && !operator.equals("abs") && !operator.equals("round") 
                && !operator.equals("ceil") && !operator.equals("floor") && !operator.equals("max") && !operator.equals("min") && !operator.equals("random") && !operator.equals("^")) {
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
                        case "^":
                            result = power(a, b);
                            break;
                        case "sqrt":
                            result = squareRoot(a);
                            break;
                        case "cbrt":
                            result = cubeRoot(a);
                            break;
                        case "log":
                            result = log(a);
                            break;
                        case "fact":
                            result = factorial(a);
                            break;
                        case "abs":
                            result = absolute(a);
                            break;
                        case "round":
                            result = round(a);
                            break;
                        case "ceil":
                            result = ceil(a);
                            break;
                        case "floor":
                            result = floor(a);
                            break;
                        case "max":
                            result = max(a, b);
                            break;
                        case "min":
                            result = min(a, b);
                            break;
                        case "random":
                            result = random();
                            break;
                        case "sin":
                            result = sin(a);
                            break;
                        case "cos":
                            result = cos(a);
                            break;
                        case "tan":
                            result = tan(a);
                            break;
                        case "asin":
                            result = asin(a);
                            break;
                        case "acos":
                            result = acos(a);
                            break;
                        case "atan":
                            result = atan(a);
                            break;
                        case "sinh":
                            result = sinh(a);
                            break;
                        case "cosh":
                            result = cosh(a);
                            break;
                        case "tanh":
                            result = tanh(a);
                            break;
                        case "toRadians":
                            result = toRadians(a);
                            break;
                        case "toDegrees":
                            result = toDegrees(a);
                            break;
                        case "hypot":
                            result = hypot(a, b);
                            break;
                        case "exp":
                            result = exp(a);
                            break;
                        case "log10":
                            result = log10(a);
                            break;
                        default:
                            System.err.println("Error! Input a correct operator.");
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