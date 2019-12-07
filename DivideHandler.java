package SimpleCalculator;

import java.util.HashMap;

public class DivideHandler implements Handler{
    double num_1,num_2;
    public DivideHandler(double num1, double num2) {
            this.num_1 = num1;
            this.num_2 = num2;
    }

    @Override
    public void handleIt() {
        double value;

        value = num_1 / num_2;
        System.out.print("The quotient of " + num_1 + " and " + num_2 + " is " + value);
    }
}
