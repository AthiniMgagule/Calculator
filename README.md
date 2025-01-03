# Calculator
# Arithmetic Calculator README

## **Overview**
This project is a command-line-based Arithmetic Calculator implemented in Java. It performs basic arithmetic operations such as addition, subtraction, multiplication, and division. The calculator reads user input in the form of a mathematical expression, parses the input, and returns the result.

---

## **Features**
- Handles the four basic arithmetic operations:
  - Addition (`+`)
  - Subtraction (`-`)
  - Multiplication (`*`)
  - Division (`/`)
- Input validation for numbers and operators.
- Exception handling for invalid inputs and division by zero.
- Extensible to support additional operations.

---

## **Usage**

### **Input Format**
The calculator accepts input in the format:
```
<number> <operator> <number>
```
For example:
```
5 + 3
12 / 4
7 * 6
```

### **Example Execution**
1. Run the program.
2. Enter a mathematical expression as prompted.
3. View the calculated result or error message if the input is invalid.

**Sample Run:**
```
Enter an expression (e.g., 5 + 3):
5 + 3
Result: 8.0
```

---

## **Implementation Details**

### **Steps:**
1. **User Input:**
   - Prompt the user for a mathematical expression.
   - Read the input as a single string.

2. **Parsing:**
   - Split the input string to extract operands and operator.
   - Validate that the operands are numbers and the operator is supported.

3. **Computation:**
   - Perform the arithmetic operation based on the operator.
   - Handle special cases like division by zero.

4. **Output:**
   - Display the result of the calculation or an appropriate error message.

---

## **Error Handling**
- **Invalid Input:**
  - If the input format is incorrect, an error message is displayed.
  - Example: `Invalid input format. Please enter in the form: <number> <operator> <number>`

- **Division by Zero:**
  - Division by zero is prevented, and a specific error message is shown.
  - Example: `Error: Division by zero is not allowed.`

---

## **Future Improvements**
- Support for parentheses to handle complex expressions.
- Implementation of advanced mathematical functions (e.g., square root, power, logarithms).
- Enhanced user interface, such as a graphical user interface (GUI).
- Support for multiple operations in a single input (e.g., `5 + 3 * 2`).

---

## **Prerequisites**
- **Java Development Kit (JDK)**
  - Version: 8 or higher
- **IDE/Text Editor**
  - Any IDE (e.g., IntelliJ IDEA, Eclipse) or text editor that supports Java.

---

## **How to Run**
1. Clone or download the repository.
2. Open the project in your preferred IDE or compile using the terminal.
3. Run the main Java class containing the `main` method.
4. Follow the prompts to enter expressions and view results.

**Command-line Compilation and Execution:**
```
javac Calculator.java
java Calculator
```

---

## **License**
This project has no licence.

---

## **Contributing**
Contributions are welcome! Feel free to submit a pull request or suggest features by opening an issue.

---

## **Contact**
For any questions or feedback, please contact:
- **Author:** [Athini Mgagule]
- **Email:** [athinimgagule03@gmail.com]

