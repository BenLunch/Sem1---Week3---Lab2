package ie.atu.week3;

public class Calculator {

    public double add(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    public double subtract(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    public double multiply(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    public double divide(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }

    public double power(double firstNum, double secondNum) {
        return Math.pow(firstNum, secondNum);
    }

    public double modulo(double firstNum, double secondNum) {
        return firstNum % secondNum;
    }

}
