package sa.fisal7.lib;

import java.util.Arrays;

public class Counting {
    public static void main(String[ ] args) {
        int x = 0;
        for (int y = 0; y < 5; y++) {
            x++;
            if (x == 3) {
                continue;
            }
            System.out.print(x + " ");
        }

//         String[ ] stringArray = new String[5];
//         for(int i = 0; i < stringArray.length; i++) {
//             Arrays.fill(stringArray, "initial");
//             stringArray[i] = "initial";
//         }
    }
}
