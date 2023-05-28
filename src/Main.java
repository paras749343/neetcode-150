import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import test.utils.TestSuite;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello NeetCode!");
    JUnitCore jUnitCore = new JUnitCore();
    jUnitCore.addListener(new TextListener(System.out));
    Result result = jUnitCore.run(TestSuite.class);
    resultReport(result);
  }

  private static void resultReport(Result result) {
    System.out.println("Finished. Result: Failures: " +
        result.getFailureCount() + ". Ignored: " +
        result.getIgnoreCount() + ". Tests run: " +
        result.getRunCount() + ". Time: " +
        result.getRunTime() + "ms.");
  }

}