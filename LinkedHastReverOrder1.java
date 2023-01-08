package JspiderClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHastReverOrder1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        lhs.add(50);
        System.out.println(lhs);
        ArrayList<Integer> al = new ArrayList<>(lhs);

        Collections.reverse(al);
        System.out.println(al);

    }

}
