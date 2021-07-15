package sa.fisal7.lib;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Foo {
      public Foo( ) {
                  System.out.print("Foo");
              }
      public Foo(String str) {
                  System.out.print("Foo" + str);
              }
  }

  class Bar extends Foo {public Bar(String str) {
                  System.out.print("Bar");
                 //Error super(str);
              }
  }

          class Tester {
      public static void main(String[ ] args) {
                  Bar b1 = new Bar("Bar");

           DateTimeFormatter formatter =
                       DateTimeFormatter.ofPattern("d M yyyy");
           LocalDate date = LocalDate.of(2015, 12, 10);
           System.out.println(date.format(formatter));

          int myVar = 2;
          System.out.println(myVar);


            int x = 7;
            int y = 0;
            while (x > 4 || y < 3) {
                    x--;
                    y++;
                }
            System.out.print(x + " " + y);

             }
  }
