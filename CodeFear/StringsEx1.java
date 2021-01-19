package CodeFear;

public class StringsEx1 {
    public static void main(String[] args) {

        //string methods
       // indexOf,replace,upperCase,lowerCase,substring



        String s = "bharat";
        String []s1 = {"bharat","sharat","ammi"};
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('a', 3));
        System.out.println(s.indexOf('x'));
        System.out.println(s.indexOf("rat"));
        for(String s2:s1){
            System.out.println(s2.endsWith("rat") + " " + s2);
        }

        String s3="ammigummi";
        System.out.println(s3.replace('a','g'));
        System.out.println(s3.substring(0));
        System.out.println(s3.substring(1,8));
    }
}
