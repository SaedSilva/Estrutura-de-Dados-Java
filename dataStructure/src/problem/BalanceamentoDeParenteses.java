package problem;

import java.util.Set;
import java.util.Stack;

public class BalanceamentoDeParenteses {
    public static void main(String[] args) {

        System.out.println(solve("2*3+(4*5)"));
        System.out.println(solve("2*3+((4*5))"));
        System.out.println(solve("2*3+{(4*5)}"));
        System.out.println(solve("2*3+{(4*5)]"));

    }

    public static boolean solve(String expression) {
        Set<Character> openSymbols = Set.of('(', '{', '[');
        Set<Character> closeSymbols = Set.of(')', '}', ']');
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (openSymbols.contains(c)) stack.push(c);
            if (closeSymbols.contains(c)) {
                if (stack.isEmpty()) return false;
                var open = stack.pop();
                if (open == '(' && c != ')') return false;
                if (open == '{' && c != '}') return false;
                if (open == '[' && c != ']') return false;
            }
        }
        return stack.isEmpty();
    }
}
