package CodeFear;

import java.util.Arrays;
import java.util.Collections;

public class ArrayEx {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(getIndex(a, 5));

    }

    public static int getIndex(int arr[], int tar) {


        int ret = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                ret = i;
                break;
            }
        }
        return ret;
    }



    //Collections.sort(li); utility method,,Collections.sort(li,Collections.reverseOrder());,Collections.copy(dest,src);
    //Collections.fill(li,'x');//replaces all items in list
  //  Collections.addAll(l1,l2);
  //  Collections.frequency(l1,"item");--returns no of occurence
    //Collections.disjoint(l1,l2);--returns true or false depends on commom items in both the list
    //list.toArray(size);
    // Arrays.asList(arr)
}
