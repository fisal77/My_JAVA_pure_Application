package sa.fisal7.lib;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MyClassQ37 {
    public static void main(String[ ] args) {
        MyClassQ37 myClass = new MyClassQ37( );
        try {
            myClass.getFile( );
            System.out.println("Exit getFile method");
        }
        catch(IOException e) {
            System.out.println(e.getMessage( ));
        }
    }
    void getFile( ) throws FileNotFoundException {

        throw new FileNotFoundException("Error: File Not Found");
//        System.out.println("Open the file");    Compilation will fail due to an error on Line 16.
    }
}
