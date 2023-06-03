package problems.arraysandhashing;

import java.util.List;

/**
 * Design an algorithm to encode a list of strings to a string. The encoded string is then sent over
 * the network and is decoded back to the original list of strings.
 * <p>
 * Please implement encode and decode
 * <p>
 * Example 1: Input: ["lint","code","love","you"], Output: ["lint","code","love","you"] Explanation:
 * One possible encode method is: "lint:;code:;love:;you"
 * <p>
 * Example 2: Input: ["we", "say", ":", "yes"] Output: ["we", "say", ":", "yes"] Explanation: One
 * possible encode method is: "we:;say:;:::;yes"
 */
public class EncodeAndDecodeStringsQ659 {

  public String encode(List<String> stringList) {
    return stringList.stream().reduce((str1, str2) -> str1 + ":;" + str2).orElse("");
  }

  public List<String> decode(String string) {
    return List.of(string.split(":;"));
  }
}
