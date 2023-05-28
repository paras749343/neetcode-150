package test.utils;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import test.TestArraysAndHashing;
import test.TestBinarySearch;
import test.TestLinkedList;
import test.TestSlidingWindow;
import test.TestStack;
import test.TestTwoPointers;

@RunWith(Suite.class)
@SuiteClasses({
    TestArraysAndHashing.class,
    TestBinarySearch.class,
    TestLinkedList.class,
    TestSlidingWindow.class,
    TestStack.class,
    TestTwoPointers.class
})
public class TestSuite {

}
