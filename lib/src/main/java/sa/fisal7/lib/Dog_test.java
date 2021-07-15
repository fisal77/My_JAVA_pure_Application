package sa.fisal7.lib;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Dog_test extends Animal_Abstract { // without abstract
//    private String breed;
//
//    public void move() {
//
//    }

    private String breed;
    public abstract void move( );


    DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern(
                    "MMM d yyyy");
    private CharSequence input;
    LocalDate date = LocalDate.
            parse(input, formatter);
}

