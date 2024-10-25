package org.iesvdm.transformer;

public class JoinBySpace implements Joiner<String>{
    @Override
    public String join(String str1, String str2) {
        return str1 + " " + str2;
    }
}
