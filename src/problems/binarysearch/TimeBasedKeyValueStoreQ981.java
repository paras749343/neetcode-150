package problems.binarysearch;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TimeBasedKeyValueStoreQ981 {

  private final HashMap<String, List<AbstractMap.SimpleEntry<String, Integer>>> map;

  public TimeBasedKeyValueStoreQ981() {
    map = new HashMap<>();
  }

  public void set(String key, String value, int timestamp) {
      if (!map.containsKey(key)) {
          map.put(key, new ArrayList<>());
      }
    map.get(key).add(new AbstractMap.SimpleEntry<>(value, timestamp));
  }

  public String get(String key, int timestamp) {
      if (!map.containsKey(key)) {
          return "";
      }
    return search(map.get(key), timestamp);
  }

  public String search(List<AbstractMap.SimpleEntry<String, Integer>> list, int timestamp) {
    int start = 0;
    int end = list.size() - 1;
    while (start < end) {
      int mid = start + (end - start + 1) / 2;
        if (list.get(mid).getValue() <= timestamp) {
            start = mid;
        } else {
            end =
                    mid - 1;
        }
    }
    return list.get(start).getValue() <= timestamp
        ? list.get(start).getKey()
        : "";
  }
}
