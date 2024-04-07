import java.util.function.Function;

public class Main {
    public static void main(String... args){
        Function<String, String> myFunction = /* blank */

        String functionResult = myFunction.apply("World");



        System.out.println(functionResult);
        // Should print: Hello world
    }
}
