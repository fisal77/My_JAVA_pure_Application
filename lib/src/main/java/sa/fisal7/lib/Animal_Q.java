package sa.fisal7.lib;

public class Animal_Q {
    static int height = 10;
    public static void main(String[ ] args) {
        Mammal gorilla = new Mammal("gorilla");
        height = 30;
        System.out.println(gorilla.name);
       // System.out.println(gorilla.height); // Compilation will fail due to an error on Line 07.
    }
}
class Mammal extends Animal {
    String name;
    Mammal(String mammalName) {
        name = mammalName;
    }
}
