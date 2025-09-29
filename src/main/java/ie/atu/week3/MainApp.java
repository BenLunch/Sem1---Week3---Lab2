package ie.atu.week3;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //Initialise scanner
        Scanner scan1 = new Scanner(System.in);
        //Create copy of calculator class so Main can access operations
        Calculator myCalc = new Calculator();
        //Exit condition for while loop
        boolean exit = true;

        //Prompt user for a number
        System.out.println("Please enter a number:");
        double firstNum = scan1.nextDouble();
        System.out.println("Please enter a second number:");
        double secondNum = scan1.nextDouble();

        while (exit) {
            //prompt user for operation
            System.out.println("Please select an operation (add, subtract, multiply, divide, power, modulo, exit):");
            String operation = scan1.next();

            //Boolean to make sure result doesn't print if switch statement isn't successful
            boolean validOperation = true;
            double result = switch (operation) {
                //Add Num1 to Num2
                case "add" -> myCalc.add(firstNum, secondNum);
                //Subtract Num2 from Num1
                case "subtract" -> myCalc.subtract(firstNum, secondNum);
                //Multiply Num1 by Num2
                case "multiply" -> myCalc.multiply(firstNum, secondNum);

                case "divide" -> {
                    if (secondNum == 0) {
                        System.out.println("Error: Cannot divide by zero");
                        validOperation = false;
                        yield 0;
                    } else {
                        yield myCalc.divide(firstNum, secondNum);
                    }
                }
                //Num1 to the power of Num2
                case "power" -> myCalc.power(firstNum, secondNum);
                //The remainder when Num1 is divided by Num 2
                case "modulo" -> myCalc.modulo(firstNum, secondNum);
                //Exit operation to stop loop when desired
                case "exit" -> {
                    exit = false;
                    System.out.println("GoodBye");
                    yield 0;
                }
                //Error message for incorrect operation choice
                default -> {
                    System.out.println("Invalid Operation");
                    validOperation = false;
                    exit = false;
                    yield 0;
                }
            };
            //Boolean prints result only when operation is resolved successfully.
            if (validOperation) {
                System.out.println("The result is: " + result);
                //Prompts user to try other operations with chosen numbers
                System.out.println("Why not try another operation. Or type exit to end program:");
            } else {
                System.out.println("Operation cancelled due to previous error");
            }
        }
        //Closing scanners when finished is good coding practice
        scan1.close();
    }
}