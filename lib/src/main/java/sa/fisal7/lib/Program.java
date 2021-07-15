package sa.fisal7.lib;

public class Program {
    public static void main (String[] args) {
//        int num = 16;
//        System.out.println(myMethod(num));


        int[ ] num = {1, 2, 3, 4, 5};
        for (int i2 = num.length - 1; i2 >= 0; i2--) {
            System.out.print(num[i2] + " ");
        }


    }

    public static int myMethod(Integer num) {
        return (int)Math.sqrt(num);
    }
}
