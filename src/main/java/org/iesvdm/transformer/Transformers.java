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

    public static <T> LispList<T> transformList(Transformer<T> tran, LispList<T> a){

        // recursion exit condition
        if (a.isEmpty()) {
            return LispList.empty();
        }
        // transform the first element of the list
        T transformedHead = tran.transform(a.head());

        // We apply recursion to transform the rest of the list (tail)
        LispList<T> transformedTail = transformList(tran, a.tail());

        return transformedTail.cons(transformedHead);

    }

}

