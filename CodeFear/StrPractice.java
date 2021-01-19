package CodeFear;

public class StrPractice {


    //charAt,indexOf,lastIndexOf
    public static String middleStr(String str) {
        int len = str.length();

        if (str.length() <= 3) {
            return str;
        }
        int middleIndx = len / 2;


        return str.substring(middleIndx - 1, middleIndx + 2);
    }

    public static boolean dogTrouble(boolean barking, int hour) {
       /* if (barking) {
            if (hour < 7 || hour > 20) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }*/
        return (barking && (hour < 7 || hour > 20));
    }


    public static void main(String[] args) {

       /* String str = "ABCDEFGH";

        String extractedStr = str.substring(2, 7);

        System.out.println(extractedStr);*/

        System.out.println(middleStr("Monitor"));
        System.out.println(middleStr("and"));
        System.out.println(dogTrouble(true, 6));
        System.out.println(dogTrouble(false, 7));
        System.out.println(dogTrouble(false, 6));

    }
}
