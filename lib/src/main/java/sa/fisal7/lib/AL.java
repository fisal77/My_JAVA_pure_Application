package sa.fisal7.lib;

import java.util.ArrayList;

public class AL {
    public static void main(String[ ] args) {
        ArrayList al = new ArrayList( );
        al.add("A");
        al.add("B");
        al.add("D");
        al.add("E");
        al.add("F");
        al.add(2, "C");
        System.out.println(al);

        int x = 5, y = 10;
        do {
            --x;
            System.out.print(x + " ");
            y++;
        } while (y < 12);



//        int x = 0;
//        int i = 0;
//        for ( ; i < 5; i++) {
//            x++;
//            if (x == 3) {
//                break;
//            }
//        }
//        System.out.println("x is: " + x);
//        System.out.println("i is: " + i);
    }
}
