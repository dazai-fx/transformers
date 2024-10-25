package org.iesvdm.transformer;

public class OddChecker implements Checker<Integer>{

    @Override
    public boolean check(Integer item) {
        boolean check = false;
        if(item%2!=0)
            check=true;
        return check;
    }

}
