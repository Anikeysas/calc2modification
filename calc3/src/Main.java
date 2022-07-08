import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (!HelpersExpression.isValidException(line)) throw new IOException("Invalid expression");
        List<String> tokens = HelpersExpression.parserExression(line);
        Mark mark = HelpersExpression.getMark(tokens.get(1));
        Variable var1 = UtilsParsing.parseVariable(tokens.get(0));
        Variable var2 = UtilsParsing.parseVariable(tokens.get(2));
        Expression expression = new Expression(var1, var2, mark);
        expression.getResult();
    }
}