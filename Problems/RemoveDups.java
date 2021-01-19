package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDups {
    public static void main(String[] args) {
        Integer a[] = new Integer[]{0, 1, 2, 3, 0, 0};
        int[] arr = new int[]{0, 1, 2, 3, 0, 0};
       
        givenListContainsDuplicates_whenRemovingDuplicatesWithPlainJava_thenCorrect(a);


    }

    public static void givenListContainsDuplicates_whenRemovingDuplicatesWithPlainJava_thenCorrect(Integer[] a) {
        List<Integer> li = Arrays.asList(a);
        List<Integer> linoDups = li.stream().distinct().collect(Collectors.toList());
        linoDups.stream().forEach(s -> System.out.println(s));
    }


}
