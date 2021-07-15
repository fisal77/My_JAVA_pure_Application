package sa.fisal7.lib;

class Testerwww {
    
    public static void main(String[] args) {
//        int i = 1;
//        for (; ; ) {
//            System.out.print(i + " ");
//        }

        int x, i = 0;
        int j = 10;
        try {
            System.out.println("Begin Calculation");
            x = j / i;
            System.out.println("After Calculation");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } catch (Exception e) {
            System.out.println("Caught Exception");
        } finally {
            System.out.println("Finally Block");
        }
        System.out.println("End Program");


        Testerwww test = new Testerwww( );
        System.out.println(test.mult(2.0));


          int[ ] num = {1, 2, 3, 4, 5};
        for (int i2 = num.length - 1; i2 >= 0; i2--) {
              System.out.print(num[i2] + " ");
          }

    }

    int mult(int num) {
        return num * num;
    }
    double mult(double num) {
        return num * num;
    }
}
