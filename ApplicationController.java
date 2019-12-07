package SimpleCalculator;
import java.util.HashMap;

//The application controller receives a handleRequest from the SimpleCalculator application.
//The application controller will send a get request to the HashMap to get the handle command needed. exampe: get("addition"
//the hashmap will send back the correct handler key/value pair for the request
//The application controller will call the handleIt method and will pass the data entered by the user.
//The correct handleIt method will perform the calculation.
//The handleIt method will call all classes needed to perform the work.
public class ApplicationController {
    private HashMap<Character, Handler> handlerMap = new HashMap<Character, Handler>();

    Character operator_;

    public ApplicationController(Character operator, double num1, double num2){
        this.operator_ = operator;
        handlerMap.put('+', new AdditionHandler(num1, num2));
        handlerMap.put('-', new SubtractHandler(num1, num2));
        handlerMap.put('*', new MultiplyHandler(num1, num2));
        handlerMap.put('/', new DivideHandler(num1, num2));

        if(operator_ == '+'){
            handlerMap.get('+').handleIt();
        }else if (operator_ == '-'){
            handlerMap.get('-').handleIt();
        }else if (operator_ == '*'){
            handlerMap.get('*').handleIt();
        }else if (operator_ == '/'){
            handlerMap.get('/').handleIt();
        }else{
            System.out.println("Invalid operator");
        }
    }
}
