import java.io.IOException;
import java.util.List;

public class UtilsParsing {
    public static Variable parseVariable(String line) throws Exception {
        try{
            int number = Integer.parseInt(line);
            if (number < 10 && number > 0){
                return new Variable(TypeVariable.INT, line);
            }
            throw new IOException("Invalid variable");

        } catch (NumberFormatException e){
            String[] tokens = line.split("");
            if (tokens.length < 13){
                return new Variable(TypeVariable.STRING, line);
            }
            throw new IOException("Invalid variable");
        }
    }
}
