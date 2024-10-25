package org.iesvdm.transformer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CheckerUtilsTest {
    @Test
    public void OddCheckerTest(){

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        OddChecker checker = new OddChecker();

        CheckerUtils.removeIfNotChecked(checker, numbers);

        System.out.println(numbers);

    }

    @Test
    public void CheckStringLessThanLength(){

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("apple", "dog", "elephant", "cat"));

        System.out.println(strings);

        CheckStringLessThanLength checker = new CheckStringLessThanLength(5);

        CheckerUtils.removeIfNotChecked(checker, strings);

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("dog", "cat"));

        assertEquals(expected, strings);

        System.out.println(strings.equals(expected) ? "Test passed!" : "Test failed.");

    }


}