package ie.atu.week3;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Please enter a number:");
        double firstNum = scan1.nextDouble();
        System.out.println("Please enter a second number:");
        double secondNum = scan1.nextDouble();
        System.out.println("Please select an operation (add, subtract, multiply, divide):");
        String operation = scan1.next();

        Calculator myCalc = new Calculator();

        boolean validOperation = true;
        double result = switch (operation) {
            //Add Num1 to Num2
            case "add" -> myCalc.add(firstNum, secondNum);
            //Subtract Num2 from Num1
            case "subtract" -> myCalc.subtract(firstNum, secondNum);
            //Error message for incorrect operation choice
            default -> {
                System.out.println("Invalid Operation");
                validOperation = false;
                yield 0;
            }
        };
        //Boolean prints result only when operation is resolved successfully
        if (validOperation) {
            System.out.println("The result is: " + result);
        }
        else {
            System.out.println("Operation cancelled due to previous error");
        }
        scan1.close();

    }
}