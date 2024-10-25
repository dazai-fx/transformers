package org.iesvdm.transformer;


import java.util.ArrayList;

public class Joiners
{
    public static <T> LispList<T> zipLists(Joiner<T> joiner,LispList<T> ls1,LispList<T> ls2)
    {
        if(ls1.isEmpty()||ls2.isEmpty())
            return LispList.empty();
        else
        {
            T h = joiner.join(ls1.head(),ls2.head());
            LispList<T> t = zipLists(joiner,ls1.tail(),ls2.tail());
            return t.cons(h);
        }
    }

    public static <T> ArrayList<T> zipArrayLists(Joiner<T> joiner, ArrayList<T> list1, ArrayList<T> list2) {

        if (list1.size() != list2.size()) {
            throw new IllegalArgumentException("Lists must be the same size");
        }

        ArrayList<T> result = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            result.add(joiner.join(list1.get(i), list2.get(i)));
        }

        return result;

    }

    public static <T> T fold(ArrayList<T> list, Joiner<T> joiner) {
        if (list.isEmpty()) {
            return null;
        }

        T result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result = joiner.join(result, list.get(i));
        }
        return result;
    }

}