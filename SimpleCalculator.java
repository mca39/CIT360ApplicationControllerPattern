package SimpleCalculator;
import java.util.Scanner;

//a handle request will be sent to the application controller, it will pass in the data entered by the user example ("addition", [2, 2])
public class SimpleCalculator {
    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        double num1, num2;
        char operator;

        //Get a valid operator. The options are +, -, *, or /
        System.out.println("This is a simple calculator. You can enter 2 decimal numbers and you can use the options +, -, *, or /.");

        boolean operatorIsValid = false;

        System.out.println("Enter the operator. The options are +, -, *, or /: ");
        do {
            operator = scan.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                operatorIsValid = true;
            } else {
                System.out.println("The operator was invalid. The valid options are +, -, *, or /: ");
            }

        } while (!operatorIsValid);

        //Get valid numbers

        System.out.println("Enter the first number to calculate by. This can be an integer or a decimal: ");
        num1 = scan.nextDouble();

        System.out.println("Enter the second number to calculate by. This can be an integer or a decimal: ");
        num2 = scan.nextDouble();

        double valueArray[] = new double[]{num1, num2};
        ApplicationController controller = new ApplicationController(operator, valueArray[0],valueArray[1]);
    }

}
