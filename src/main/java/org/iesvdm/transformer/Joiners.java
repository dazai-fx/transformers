package org.iesvdm.transformer;


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

    public static <T> LispList<T> zipArrayList(Joiner<T> joiner, LispList<T> ls1, LispList<T> ls2){

        LispList<T> lsResult = LispList.empty();

        if(ls1.isEmpty()||ls2.isEmpty())
            return LispList.empty();
        else {

            T h = joiner.join(ls1.head(),ls2.head());
            LispList<T> t = zipLists(joiner,ls1.tail(),ls2.tail());


        }

        return ls1;
    }

}