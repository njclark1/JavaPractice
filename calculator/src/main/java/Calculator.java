import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;

public class Calculator {

//    DoubleBinaryOperator is for taking two doubles are producing a result
    private static Map<String, DoubleBinaryOperator> OPERATIONS = new HashMap<>();

    static {
        OPERATIONS.put("+", (a, b) -> a + b);
        OPERATIONS.put("plus", (a, b) -> a + b);
        OPERATIONS.put("Plus", (a, b) -> a + b);
        OPERATIONS.put("-", (a, b) -> a - b);
        OPERATIONS.put("minus", (a, b) -> a - b);
        OPERATIONS.put("Minus", (a, b) -> a - b);
        OPERATIONS.put("*", (a, b) -> a * b);
        OPERATIONS.put("times", (a, b) -> a * b);
        OPERATIONS.put("Times", (a, b) -> a * b);
        OPERATIONS.put("/", (a, b) -> a / b);
        OPERATIONS.put("!", (a, b) -> Double.max(a, b));

    }

    public static void main(String[] args) {

//        validate input length
        if (args.length != 3) {
            printUsage();
            System.exit(-1);
        }

//        declare variables
        final double num1;
        final double num2;
//        validate input is numeric
        try {
            num1 = Double.parseDouble(args[0]);
            num2 = Double.parseDouble(args[2]);
        } catch (final NumberFormatException e) {
            printUsage();
            System.exit(-1);
            return;
        }
//        declare operator variable
        final String operator = args[1];
//        output calculator result to user
        System.out.println(doMath(num1, num2, operator));
    }

    public static double doMath(final Double num1, final Double num2, final String operator) {
//        check if map has an operator
        if (!OPERATIONS.containsKey(operator)) {
            printUsage();
            System.exit(-1);
            return 0;
        }
        return OPERATIONS.get(operator).applyAsDouble(num1, num2);
    }

    public static void printUsage() {
        System.err.println("Usage: A [ + | - | x | / ] B");
    }
}
