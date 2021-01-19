package CodeFear;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {

        String s[]= {"hi","hello"};
        List<String>al =  new ArrayList<String>();

        for(String st:s){
            al.add(st);
        }


        //iterator methods ---hasNext(),next(),contains(),remove()
        Iterator<String> it = al.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
