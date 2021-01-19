package DataStructures.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void arrayListDemo() {
        //Collection<Integer> al = new ArrayList<>();
//method signature binding
        // remove()--present in both collection and list interface so
        List<Integer> al = new ArrayList<>();
        boolean b = al.add(1);
        al.add(2);
        al.add(3);
        al.add(3);

        al.add(null);
        // System.out.println(b);
        System.out.println("array list elements are " + al);
        al.remove(3);
        System.out.println("array list elements are " + al);
        al.remove(3);
        System.out.println("array list elements are " + al);

        al.add(0, 100);
        System.out.println("array list elements are " + al);
        int val = al.set(0, 101);
        System.out.println("array list elements are " + al);
        System.out.println("zeroth value before " + val);



        List<Integer> list3 = al.subList(2, 3);
        list3.set(0, 6);
        System.out.println("list1: " + al);
        list3.add(0, 7);
        System.out.println("list1: " + al);
        al.set(2, 8);
        System.out.println("list3: " + list3);
        //list1.add(0, 8);
        //System.out.println("list3: " + list3);
        System.out.println("list1: " + al);

        for (int element : al) {
            System.out.println("element: " + element);

            // Generates ConcurrentModificationException
            if (element == 9) {
                al.remove(Integer.valueOf(element)); // valueOf is used due to its caching
            }
        }
    }

    public static void main(String[] args) {
        arrayListDemo();
    }
}
