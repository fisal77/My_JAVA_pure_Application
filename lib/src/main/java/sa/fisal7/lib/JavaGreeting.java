package sa.fisal7.lib;

public class JavaGreeting {
    public static void main(String[ ] args) {

        int[ ] anArray;
        int[ ][ ][ ] anArrays;

        String[] letters = new String[4];
        letters[1] = "Hello";
        letters[2] = "Java";
      //  letters[3] = 7;
     //   Execution fails because of the statement entered at the command prompt.


        for (String item : letters) {
            System.out.print(item + " ");
        }
    }
}
