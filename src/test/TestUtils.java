package test;

import java.util.*;

public class TestUtils {
    static <T> boolean isSimilarListOfList(List<List<T>> expected, List<List<T>> actual) {
        HashSet<HashSet<T>> expectedHashSet = new HashSet<>();
        HashSet<HashSet<T>> actualHashSet = new HashSet<>();
        for( List<T> stringList : expected){
            expectedHashSet.add(new HashSet<>(stringList));
        }

        for( List<T> stringList : actual){
            actualHashSet.add(new HashSet<>(stringList));
        }
        return Objects.equals(expectedHashSet, actualHashSet);
    }
    static <T> boolean isSimilarList(List<T> expected, List<T> actual){
        return Objects.equals(new HashSet<>(expected), new HashSet<>(actual));
    }

    static List<Integer> intArrayToIntegerList(int[] input){
        List<Integer> resultList = new ArrayList<>();
        Arrays.stream(input).forEach(resultList::add);
        return resultList;
    }

}
