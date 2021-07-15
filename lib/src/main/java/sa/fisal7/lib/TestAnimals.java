package sa.fisal7.lib;

public class TestAnimals {
    public static void main(String[ ] args) {
        Animal animal1 = new Dog( );
        Animal animal2 = new Monkey( );
        Animal animal3 = new Animal( );
        animal1.walk( );
        animal2.walk( );
        animal3.walk( );
    }
}
class Animal {
    void walk( ) {
        System.out.print("walking ");
    }
}
class Dog extends Animal {
    void walk( ) {
        super.walk( );
        System.out.println("a Dog");
    }
}
class Monkey extends Animal {
    void walk( ) {
        System.out.println("a Monkey");
    }
}
