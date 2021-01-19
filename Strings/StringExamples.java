package Strings;

public class StringExamples {
    public static void main(String[] args) {
stringDemo("Hello World!");

    }
    static void stringDemo(String str){
        System.out.println("length os string is " + str.length());
        System.out.println("is string empty? " + str.isEmpty());

        System.out.println("comparing operatins");

        System.out.println("comapring 2 strings " + str.equals("HELLO WORLD!"));
        System.out.println("comparing by ignoring case " + str.equalsIgnoreCase("HELLO WORLD!"));
        System.out.println("by compareTo method of comparable interface  " + str.compareTo("HELLO WORLD!"));

        System.out.println("searching in the string");
        System.out.println("contains " + str.contains("HELLO WORLD!"));
        System.out.println("contains " + str.contains("World"));
        System.out.println("index of " + str.indexOf('r'));
        System.out.println("starts with " + str.startsWith("H"));
        System.out.println("ends with " + str.endsWith("!"));
        System.out.println("first index of " + str.indexOf("l"));
        System.out.println("last index of " + str.lastIndexOf("d"));


        System.out.println("substring examples");

        System.out.println("substring example " + str.substring(6));

        System.out.println("substring inclusive and exclusive " + str.substring(6,12));

        System.out.println("-----------case conversions ----------");

        System.out.println("string is immutable,while coverting lower and upper cases it just returns a copy of that string in lower and upper cases ");
        System.out.println("covert to lower case " + str.toLowerCase());
        System.out.println("covert to upper case " + str.toUpperCase());
        System.out.println("trim example which removeds any white spaces between starting and ending positions " + str.trim());


        System.out.println("replace method "+ str.replace('H','h'));

        System.out.println("split method example");

        String [] s=str.split(" ");
        for(String t:s){
            System.out.println(t);
        }

        System.out.println("String value of 5.0 is --using static method" + String.valueOf(5.0));
    }


}
