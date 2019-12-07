package SimpleCalculator;

public class MultiplyHandler implements Handler{
    double num_1,num_2;
    public MultiplyHandler(double num1, double num2) {
        this.num_1 = num1;
        this.num_2 = num2;
    }

    @Override
    public void handleIt() {
        double value;

        value = num_1 * num_2;
        System.out.print("The product of " + num_1 + " and " + num_2 + " is " + value);
    }
}
