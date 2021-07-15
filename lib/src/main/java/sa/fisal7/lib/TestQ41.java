package sa.fisal7.lib;

public class TestQ41 {
    public static int num = 0;
}

class TestDemo2 {
    public static void main(String[ ] args) {
        TestQ41 a = new TestQ41( );
        TestQ41 b = new TestQ41( );
        a.num += 1;
        b.num += a.num;
        System.out.println("a.num: " + a.num);
        System.out.println("b.num: " + b.num);


        try {
            int x = 3;
            int y = 2;
            int z = 4;
            int total = (x++ + ++x) * (y - z);
            System.out.println(total);

        } catch (ArithmeticException | NullPointerException e) {

        } catch (Exception e) {

        } finally {

        }

    }
}
