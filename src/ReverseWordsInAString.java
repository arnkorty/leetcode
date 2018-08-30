import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        Stack<String> words = new Stack<>();
        StringBuilder curr = new StringBuilder();
        for (char c: s.toCharArray()) {
            if(c != ' ') {
                curr.append(c);
            } else {
                if (curr.length() > 0) {
                    words.add(curr.toString());
                }
                curr = new StringBuilder();
            }
        }
        if (curr.length() > 0) {
            words.add(curr.toString());
        }
        StringBuilder result = new StringBuilder();

        if (!words.isEmpty())
            result.append(words.pop());
        while(!words.isEmpty()) {
            result.append(" ");
            result.append(words.pop());
        }
        return result.toString();
    }
    public static void main(String[] args) {
        ReverseWordsInAString obj = new ReverseWordsInAString();
        System.out.println(obj.reverseWords("the sky is blue"));
    }
}
