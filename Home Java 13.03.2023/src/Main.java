import java.beans.JavaBean;

public class Main {
    public static void main (String[] args) {
       String str1 =  " I study Basic Java! ";
       String substring = "Java";
       System.out.println(str1.charAt(19));
       System.out.println(str1.contains(substring));
       String newString = str1.replace('a', 'o');
       System.out.println("str1" + str1);
       System.out.println("newString" + newString);
       System.out.println(str1.toUpperCase());
       System.out.println(str1.toLowerCase());
       System.out.println(str1.substring(0,14));

    }
}
