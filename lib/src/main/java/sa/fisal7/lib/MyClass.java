package sa.fisal7.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import java.io.*;

class MyClass {


    public static String getStr(String str)
            throws IOException
    {
        if (str == null)
            throw new IOException( );


        return "Done";
    }

    public static void main(String[ ] args) {
        String s = null;
        try {
            String tester = getStr(s);
            System.out.println("The value of tester is: " + tester);
        } catch (IOException ex) {
            System.out.println("IOException caught");
        }






        String rhyme= "She sells sea shells";
        StringBuilder sb = new
                StringBuilder(rhyme);
        rhyme = String.valueOf(sb.reverse( ));

        System.out.println(rhyme);
    }

}


