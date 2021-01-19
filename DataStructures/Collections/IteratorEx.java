package DataStructures.Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {


    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        boolean b = al.add(1);
        al.add(2);
        al.add(3);
        al.add(3);

        Iterator<Integer> it=al.iterator();
        while(it.hasNext()){
            int item=it.next();
            if(item==3){
                it.remove();
            }
        }
        System.out.println(al);

        al.forEach(System.out::println);
    }
}
