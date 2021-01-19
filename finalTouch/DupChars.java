package finalTouch;

import java.util.HashMap;
import java.util.Set;

public class DupChars {
    public static void dups(String s) {

        char ch[] = s.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for (char c : ch) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            }
            else {
                hm.put(c, 1);
            }
        }
        Set<Character> charsInString = hm.keySet();

        System.out.println("Duplicate Characters In "+s);

        //Iterating through Set 'charsInString'

        for (Character ch1 : charsInString)
        {
            if(hm.get(ch1) > 1)
            {
                //If any char has a count of more than 1, printing it's count

                System.out.println(ch1 +" : "+ hm.get(ch1));
            }
        }

    }

    public static void main(String[] args) {
        dups("JavaJ2EE");
    }
}
