package sa.fisal7.lib;

public class Looping {
    public static void main(String[ ] args) {
//        int a = 0;
//        int b = 10;
//        for (int c = 0; b > c; b--) {
//            c++;
//        }
  // ERROR here      System.out.print(a + " " + b + " " + c);




        int x = 0;
        boolean bool = true;
        do {
            while (x < 3) {
                System.out.print(x + " ");
                x++;
            }
            bool = false;
            x++;
        } while (bool == true);
        System.out.print(x);

    }
}
