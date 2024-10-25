package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.Iterator;

public class CheckerUtils {

    public static <T> void removeIfNotChecked(Checker<T> checker, ArrayList<T> list) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            T item = iterator.next();
            if (!checker.check(item)) {
                iterator.remove();
            }
        }
    }

}
