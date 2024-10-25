package org.iesvdm.transformer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ConcatenateStringTest {

    @Test
    void concatenatedStringTest2() {

        LispList<String> strings = LispList.empty();
        strings = strings.cons("Alice").cons("Bob").cons("Charlie");

        TransformString helloAdder = new TransformString("Hello");

        LispList<String> transformedList = Transformers.transformList(helloAdder, strings);

        System.out.println("Resultado con saludo 'Hello': " + transformedList);

    }

    @Test
    public void concatenatedTest5() {

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Alice");
        stringList.add("Bob");
        stringList.add("Charlie");

        TransformString welcomeAdder = new TransformString("Welcome");

        Transformers.applyDest(welcomeAdder, stringList);

        System.out.println("Resultado con saludo 'Welcome': " + stringList);

    }

}