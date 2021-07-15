package sa.fisal7.lib;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NumberChange {
         public static void main(String [ ] Args) {
                 NumberChange num = new NumberChange( );
                 Integer[ ] x = new Integer[3];
                 num.changeNumber(x);
                 for (int y = 0; y < x.length; y++) {
                     System.out.print(x[y] + " ");
                 }

//             int x = 10;
//             NumberChange num = new NumberChange( );
//             num.changeNumber(x);
//             System.out.println("x is: " + x);

            }


//    public void changeNumber(int x) {
//        x = 15;
//    }

     public void changeNumber(Integer[ ] x) {
                 for (int y = 0; y < x.length; y++) {
                         x[y] = new Integer(y);
                     }
             }


}
