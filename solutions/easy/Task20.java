package solutions.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task20 {

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{')
                stack.add(ch);
            if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty() || stack.removeLast() != getReverse(ch))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private static char getReverse(char ch) {
        return switch (ch) {
            case ')' -> '(';
            case ']' -> '[';
            case '}' -> '{';
            default -> throw new RuntimeException();
        };
    }
}
