package Problems;

public class PaliandromeStringTest {
    public static void main(String[] args) {

        String reverse=isPal("aba");
        System.out.println("aba".equals(reverse));
    }

    public static String isPal(String str){

        if(str==null || str.isEmpty()){
            return str;
        }
        return str.charAt(str.length()-1)+isPal(str.substring(0,str.length()-1));

    }
}
