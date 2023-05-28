package problems.stack;

import java.util.Stack;

public class EvaluateReversePolishNotationQ150 {

  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    int top1, top2;
    for (String str : tokens) {
      switch (str) {
        case "+" -> {
          top1 = stack.pop();
          top2 = stack.pop();
          stack.push(top2 + top1);
        }
        case "-" -> {
          top1 = stack.pop();
          top2 = stack.pop();
          stack.push(top2 - top1);
        }
        case "*" -> {
          top1 = stack.pop();
          top2 = stack.pop();
          stack.push(top2 * top1);
        }
        case "/" -> {
          top1 = stack.pop();
          top2 = stack.pop();
          stack.push(top2 / top1);
        }
        default -> stack.push(Integer.valueOf(str));
      }
    }
    return stack.peek();
  }
}
