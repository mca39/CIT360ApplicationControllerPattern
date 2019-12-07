package SimpleCalculator;

import java.util.HashMap;

//This is a target that will implement the handlit method
// the handleit method has all the code to handle the situation indicated by the command key in the hashmap and will only handle 1 situation
public class AdditionHandler implements Handler {
    double num_1,num_2;
    public AdditionHandler(double num1, double num2){
        this.num_1 = num1;
        this.num_2 = num2;
    }

    @Override
    public void handleIt() {
        System.out.println("add");
        double value;

        value = num_1 + num_2;
        System.out.print("The sum of " + num_1 + " and " + num_2 + " is " + value);
    }
}
