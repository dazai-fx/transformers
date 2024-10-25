package org.iesvdm.transformer;

import java.util.ArrayList;

public class UseJoiners2 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("trick");
        words.add("or");
        words.add("treat");

        JoinBySpace joiner = new JoinBySpace();
        String result = Joiners.fold(words, joiner);

        System.out.println(result);

    }

}
