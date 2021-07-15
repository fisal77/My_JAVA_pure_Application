package sa.fisal7.lib;

import java.time.LocalDateTime;

public class Q9 {
     public static int age = 0;
    public static void main (String[ ] args ) {
int aaa = age;

        LocalDateTime date = LocalDateTime.now( );

        String name1 = new String("Java");
        String name2 = new String("Java");

        if (name1 == name2) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }

        if (name1.equals(name2)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }


        String s = "Hello World";

        System.out.println(s.indexOf(s.length( )));
        System.out.println(s.substring(5,
                s.length( )));

        System.out.println(s.indexOf(5));
        System.out.println(s.substring(6,
                s.length( )));
    }
}
