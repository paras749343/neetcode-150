package problems.stack;

import java.util.Map;
import java.util.Stack;

public class MinStackQ155 {

  private final Stack<Map.Entry<Integer, Integer>> stack;

  public MinStackQ155() {
    stack = new Stack<>();
  }

  public void push(int val) {
    if (stack.isEmpty() || stack.peek().getValue() > val) {
      stack.push(Map.entry(val, val));
    } else {
      stack.push(Map.entry(val, stack.peek().getValue()));
    }
  }

  public void pop() {
    stack.pop();
  }

  public int top() {
    return stack.peek().getKey();
  }

  public int getMin() {
    return stack.peek().getValue();
  }
}
