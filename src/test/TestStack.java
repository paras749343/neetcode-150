package test;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import problems.stack.EvaluateReversePolishNotationQ150;
import problems.stack.GenerateParenthesesQ22;
import problems.stack.MinStackQ155;
import problems.stack.ValidParenthesesQ20;
import test.utils.TestUtils;

public class TestStack {

  @Test
  public void testValidParenthesesQ20() {
    ValidParenthesesQ20 validParenthesesQ20 = new ValidParenthesesQ20();
    var result = validParenthesesQ20.isValid("()[]{}");
    Assert.assertTrue(result);
  }

  @Test
  public void testMinStackQ155() {
    MinStackQ155 minStackQ155 = new MinStackQ155();
    minStackQ155.push(-2);
    minStackQ155.push(0);
    minStackQ155.push(-3);
    Assert.assertEquals(-3, minStackQ155.getMin());
    minStackQ155.pop();
    Assert.assertEquals(0, minStackQ155.top());
    Assert.assertEquals(-2, minStackQ155.getMin());
  }

  @Test
  public void testEvaluateReversePolishNotationQ150() {
    EvaluateReversePolishNotationQ150 evaluateReversePolishNotationQ150 = new EvaluateReversePolishNotationQ150();
    var result = evaluateReversePolishNotationQ150.evalRPN(
        new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
    Assert.assertEquals(22, result);
  }

  @Test
  public void testGenerateParenthesesQ22() {
    GenerateParenthesesQ22 generateParenthesesQ22 = new GenerateParenthesesQ22();
    var result = generateParenthesesQ22.generateParenthesis(3);
    Assert.assertTrue(
        TestUtils.isSimilarList(List.of("((()))", "(()())", "(())()", "()(())", "()()()"), result));
  }


}
