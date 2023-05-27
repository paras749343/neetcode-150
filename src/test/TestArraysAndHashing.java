package test;


import problems.arraysandhashing.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TestArraysAndHashing {
    @Test
    public void testContainsDuplicateQ217(){
        ContainsDuplicateQ217 containsDuplicateQ217 = new ContainsDuplicateQ217();
        var result = containsDuplicateQ217.containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2});
        Assert.assertTrue(result);
    }

    @Test
    public void testValidAnagramQ242(){
        ValidAnagramQ242 validAnagramQ242 = new ValidAnagramQ242();
        var result = validAnagramQ242.isAnagram("anagram","nagaram");
        Assert.assertTrue(result);
    }

    @Test
    public void testTwoSumQ1(){
        TwoSumQ1 twoSumQ1 = new TwoSumQ1();
        var result = twoSumQ1.twoSum(new int[]{2,7,11,15}, 9);
        Assert.assertTrue(TestUtils.isSimilarList(Arrays.asList(0,1), TestUtils.intArrayToIntegerList(result)));
    }

    @Test
    public void testGroupAnagramsQ49(){
        GroupAnagramsQ49 groupAnagramsQ49 = new GroupAnagramsQ49();
        var result = groupAnagramsQ49.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of("bat"));
        expected.add(List.of("nat", "tan"));
        expected.add(List.of("ate", "eat", "tea"));
        Assert.assertTrue(TestUtils.isSimilarListOfList(expected, result));
    }

    @Test
    public void testTopKFrequentElementsQ347(){
        TopKFrequentElementsQ347 topKFrequentElementsQ347 = new TopKFrequentElementsQ347();
        var result = topKFrequentElementsQ347.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
        Assert.assertTrue(TestUtils.isSimilarList(Arrays.asList(1,2), TestUtils.intArrayToIntegerList(result)));
    }

    @Test
    public void testProductOfArrayExceptSelfQ238(){
        ProductOfArrayExceptSelfQ238 productOfArrayExceptSelfQ238 = new ProductOfArrayExceptSelfQ238();
        var result = productOfArrayExceptSelfQ238.productExceptSelf(new int[]{1,2,3,4});
        Assert.assertArrayEquals(new int[]{24,12,8,6}, result);
    }

    @Test
    public void testValidSudokuQ36(){
        ValidSudokuQ36 validSudokuQ36 = new ValidSudokuQ36();
        var result = validSudokuQ36.isValidSudoku(getTestSudoku());
        Assert.assertTrue(result);
    }

    @Test
    public void testEncodeAndDecodeStringsQ659(){
        EncodeAndDecodeStringsQ659 encodeAndDecodeStringsQ659 = new EncodeAndDecodeStringsQ659();
        var stringList= List.of("Hello", "My", "Name", "Is", "Paras");
        String encodedString =  encodeAndDecodeStringsQ659.encode(stringList);
        List<String> decodedStringList = encodeAndDecodeStringsQ659.decode(encodedString);
        Assert.assertEquals(stringList, decodedStringList);
    }

    @Test
    public void testLongestConsecutiveSequenceQ128(){
        LongestConsecutiveSequenceQ128 longestConsecutiveSequenceQ128 = new LongestConsecutiveSequenceQ128();
        var result = longestConsecutiveSequenceQ128.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});
        Assert.assertEquals(9, result);
    }

    private char[][] getTestSudoku() {
        return new char[][]{
                new char[] {'5','3','.','.','7','.','.','.','.'},
                new char[] {'6','.','.','1','9','5','.','.','.'},
                new char[] {'.','9','8','.','.','.','.','6','.'},
                new char[] {'8','.','.','.','6','.','.','.','3'},
                new char[] {'4','.','.','8','.','3','.','.','1'},
                new char[] {'7','.','.','.','2','.','.','.','6'},
                new char[] {'.','6','.','.','.','.','2','8','.'},
                new char[] {'.','.','.','4','1','9','.','.','5'},
                new char[] {'.','.','.','.','8','.','.','7','9'}
        };
    }


}
