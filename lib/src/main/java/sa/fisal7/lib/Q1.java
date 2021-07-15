package sa.fisal7.lib;

import java.util.ArrayList;

public class Q1 {

        public static void main(String [ ] args) {
            int x = 3;
            int y = 5;
            int z = 1;
            if(checkSum(x,y) || checkSum(y,z)) {
                System.out.print("a");
            }

            ArrayList myAList = new ArrayList( );
            myAList.add("hello");
            myAList.add("world");
            myAList.add(20);
            myAList.add("20");
            myAList.add("world");
            System.out.println(myAList.indexOf("world"));
            System.out.println(myAList.indexOf("Java"));


            int num = 2;
            switch (num) {
                case 0:
                    System.out.print("foo");
                    break;
                case 1:
                    System.out.print("bar");
                    break;
                case 2:
                    System.out.print("foofoo");
                case 3:
                    System.out.print("barbar");
                case 4:
                    System.out.print("foobar");
                    break;
                case 5:
                    System.out.print("barfoo");
                    break;
                default:
                    System.out.print("Finished");
            }

        }
        private static boolean checkSum(int x, int y) {
            if(x + y >= 7) {
                System.out.print("b");
                return true;
            }
            System.out.println("c");
            return false;
        }




}
