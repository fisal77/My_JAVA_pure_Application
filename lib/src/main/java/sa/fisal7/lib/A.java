package sa.fisal7.lib;

//abstract class A {
//    abstract void eat( );
//    void swim( ) { }
//}
//class B extends A {
//
//    void eat( ) { }
//}


class A {
    public void play( ) {
        System.out.println("In class A");
    }
}

class B extends A {
    public void play( ) {
        System.out.println("In class B");
    }
}

class Demo {
    public static void main(String[ ] args) {
        B b = new B( );
        A a = b;
        a.play( );
        b.play( );


        StringBuilder sb = new StringBuilder("Test ");
     // ERROR HERE   String test = sb.append("StringBuilder");
     //   System.out.print(test);
    }
}