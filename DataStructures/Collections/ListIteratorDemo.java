package DataStructures.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        boolean b = al.add(1);
        al.add(2);
        al.add(3);
        al.add(3);

        for(ListIterator<Integer> li= al.listIterator();
            li.hasNext(); ){
            System.out.println(li.nextIndex() + "" + li.next());
        }
    }
}
