package sa.fisal7.lib;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TestClass {
    public static void main(String[ ] args) {

        A aReference = new A();
        B bReference = new B();

      //  aReference.aString = bReference.bString;
        

        String data = "2007-12-03T10:15:30";
        LocalDateTime date = LocalDateTime.
                parse(data, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(date);

        TestClass test = new TestClass( );
        try {
            test.calc( );
            System.out.println("Finished with file");
        }
        catch(IOException e) {
            System.out.println(e.getMessage( ));
        }


String planet = "Earth";
        switch (planet) {
            case "Mercury":
            case "Venus":
            case "Earth":
            case "Mars":
                System.out.println("This is an inner planet.");
                break;
            case "Jupiter":
            case "Saturn":
            case "Uranus":
            case "Neptune":
                System.out.println("This is an outer planet.");
                break;
            default:
                System.out.println("Not a planet in our solar system.");
        }




    }
    void calc( ) throws IOException {
        throw new IOException("IO Error");
    }

//    int x = 0;
//   while (true) {                 // Compilation fails due to an error on Line 02.
//        System.out.print(x + " ");
//        x = x + 2;
//        if (x > 6) {
//            break;
//        }
//    }


}
