package org.iesvdm.transformer;

public class CheckStringLessThanLength implements Checker<String>{

    private int maxLength;

    public CheckStringLessThanLength(int maxLength) { this.maxLength = maxLength; }

    @Override
    public boolean check(String item) {
        return item.length() < maxLength;
    }

}
