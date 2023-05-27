package problems.arraysandhashing;

import java.util.List;

public class EncodeAndDecodeStringsQ659 {

    public String encode(List<String> stringList) {
        return stringList.stream().reduce((str1, str2) -> str1 + ":;" +str2).orElse("");
    }

    public List<String> decode(String string) {
        return List.of(string.split(":;"));
    }
}
