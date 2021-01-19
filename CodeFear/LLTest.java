package CodeFear;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LLTest {

    private static  void printMe(LinkedList<String> l){
        for(String s:l){
            System.out.println(s);
        }
    }

    private static void revereMe(LinkedList<String> l){
        ListIterator<String> li = l.listIterator(l.size());
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
    public static void main(String[] args) {
        String s1[] = {"hi", "hello"};
        String s2[] = {"how", "are ", "you?"};

        LinkedList<String> l1 = new LinkedList<>();

        for (String s : s1) {
            l1.add(s);
        }
        List<String> l2 = new LinkedList<>();

        for (String s : s2) {
            l1.add(s);
        }

        l1.addAll(l2);
        printMe(l1);
        revereMe(l1);
        l1.subList(0,2).clear();


        System.out.println("clear");
        printMe(l1);
    }
}
