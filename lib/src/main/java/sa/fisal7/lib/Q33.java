package sa.fisal7.lib;

import java.util.ArrayList;

public class Q33 {
    public static void main(String[ ] args) {
        ArrayList myArrayList = new ArrayList( );
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.remove(1);

        for(Object b: myArrayList) {
            System.out.print(b + " ");
        }
    }
}
