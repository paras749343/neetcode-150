package problems.stack;

import java.util.Stack;

public class ValidParenthesesQ20 {

  public boolean isValid(String s) {
    Stack<Character> characterStack = new Stack<>();
    for (int iterator_i = 0; iterator_i < s.length(); ++iterator_i) {
      char currentCharacter = s.charAt(iterator_i);
      if (currentCharacter == '(' || currentCharacter == '[' || currentCharacter == '{') {
        characterStack.push(currentCharacter);
      } else {
        if (characterStack.isEmpty() || characterStack.peek() != getOpposite(currentCharacter)) {
          return false;
        }
        characterStack.pop();
      }
    }

    return characterStack.isEmpty();

  }

  private static Character getOpposite(char currentCharacter) {
    if (currentCharacter == ')') {
      return '(';
    }
    if (currentCharacter == ']') {
      return '[';
    }
    if (currentCharacter == '}') {
      return '{';
    }
    return 'x';
  }
}
