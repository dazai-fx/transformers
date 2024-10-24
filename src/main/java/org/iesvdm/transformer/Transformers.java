package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Transformers
{
    public static <T> ArrayList<T> applyConst(Transformer<T> tran, ArrayList<T> a)
    {
        ArrayList<T> b = new ArrayList<>();
        for(T t : a)
            b.add(tran.transform(t));
        return b;
    }

    public static <T> void applyDest(Transformer<T> tran, ArrayList<T> a){

        for (int i = 0; i < a.size(); i++) {
            a.set(i, tran.transform(a.get(i)));
        }

    }

}

