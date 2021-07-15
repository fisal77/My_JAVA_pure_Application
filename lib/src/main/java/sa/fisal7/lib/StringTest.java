package sa.fisal7.lib;

public class StringTest {
    String data;

    public StringTest(String s) {
        data = s;
    }

    public static void main(String[ ] args) {
        StringBuilder sb = new StringBuilder("10");
        // System.out.println(new StringTest(sb)); A compiler error will occur due to the code on Line 10.


        int x = 18;
        int y = 7;
        boolean a, b;
        a = false;
        if (x / 2 < y + 3)
            a = true;
        b = true;

        //Insert code here
        boolean d = x > 13 && 7 <= y;
        if (a && b) { }


        String[ ][ ] firstName;
        firstName = new String[14][ ];

        Employee2 myManager = new Manager( );
    //    Manager myExec = new Executive( ); // Compilation will fail due to an error on Line 04.

    }

}

class Employee2 { }
class Manager extends Employee2 { }
class Executive extends Employee2 { }
