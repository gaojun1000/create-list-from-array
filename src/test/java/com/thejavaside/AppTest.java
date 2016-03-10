package com.thejavaside;

import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void createListFromArray() {
        String[] arr = new String[] {"a", "b", "c"};
        //internally it creates an ArrayList which has "arr" as the backing array. Be aware,
        //this ArrayList is an internal class of Arrays, which is not java.util.ArrayList. It only
        //has partial implementation of list interface.
        List<String> list = Arrays.asList(arr);
        assertEquals("the size should be the same", arr.length, list.size());

        //this will throw an UnsupportedOperationException exception
        //list.remove(0);
    }

    @Test
    public void createListFromArrayWithGuava() {
        String[] arr = new String[] {"a", "b", "c"};
        //internally it creates an ArrayList, and then it adds all elements from arr into the new list.
        List<String> list = Lists.newArrayList(arr);
        assertEquals("the size should be the same", arr.length, list.size());

        //this is fine.
        list.remove(0);
    }

    @Test
    public void createListFromIntArrayWithGuava() {

        int[] intArray = new int[] {1,2,3};
        //List<Integer> intList = Lists.(intArray);
        List<Integer> integerList = Ints.asList(intArray);
        assertEquals("the size should be the same", intArray.length, integerList.size());

    }
}
