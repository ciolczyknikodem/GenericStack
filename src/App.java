import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String exampleWord = "HELLO";

        for (char letter: exampleWord.toCharArray()) { stack.push(letter); }

        int length = stack.getSize();
        char[] reverseWord = new char[length];

        try {
            for (int i = 0; i < length; i++) {
                reverseWord[i] = stack.pop();
            }
        }
        catch (StackUnderFlowError e) {
            System.err.println(e.getMessage());
        }

        System.out.println(Arrays.toString(reverseWord));
    }
}
