package problems.stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class GenerateParenthesesQ22 {
    private final Stack<Character> stack = new Stack<>();
    private final List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(0,0, n);
        return res;
    }

    private void backtrack(int openN, int closedN, int n) {
        if (openN == closedN && closedN == n) {
            Iterator<Character> vale = stack.iterator();
            StringBuilder temp = new StringBuilder();
            while (vale.hasNext()) {
                temp.append(vale.next());
            }
            res.add(temp.toString());
        }
        if (openN < n) {
            stack.push('(');
            backtrack(openN + 1, closedN, n);
            stack.pop();
        }
        if (closedN < openN) {
            stack.push(')');
            backtrack(openN, closedN + 1, n);
            stack.pop();
        }
    }
}
