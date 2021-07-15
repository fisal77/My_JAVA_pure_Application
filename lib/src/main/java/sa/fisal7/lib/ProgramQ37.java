package sa.fisal7.lib;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProgramQ37 {
    public static void main (String[ ] args ) {
//        double var1 = new Double(5.6);
//        double var2 = 2.5;
//        System.out.println(product(var1, var2));
          int[ ] numbers = {1, 5, 8, 9, 22, 10};
//           myClass calc = new myClass( );
//            System.out.print(calc.sum(numbers));


         DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("DD MM YYYY");
         LocalDate date = LocalDate.of(2015, 12, 20);

         System.out.println(date.format(formatter));

    }

//     void sum(int[ ] numbers) {
//            return true;
//         }

    public static int product(Double num1, Double num2) {
     // ERROR   return num1 * num2;
        return 0; // HERE Correct
    }
}
