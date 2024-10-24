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

        // condición de salida de la recursividad
        if (a.isEmpty()) {
            return LispList.empty();
        }
        // transforma el primer elemento de la lista
        T transformedHead = tran.transform(a.head());

        // Aplicamos recursividad para transformar el resto de la lista (tail)
        LispList<T> transformedTail = transformList(tran, a.tail());

        return transformedTail.cons(transformedHead);

    }

}

