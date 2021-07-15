package sa.fisal7.lib;

public class MyClassQ52 {
    public static void main(String[ ] args) {
        Double num = 2.0;
        MyClassQ52 myClass = new MyClassQ52( );
        TestQ52 test = new TestQ52( );
        myClass.number(test);
        System.out.println(test.num);
    }
    void number(TestQ52 test) {
        test.num = test.num * test.num;
    }
}
class TestQ52 {
    Double num = 3.0;
}
