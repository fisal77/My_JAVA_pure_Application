package sa.fisal7.lib;

class MakeVertebrates {
    public static void main(String[ ] args) {
        Vertebrate whiteCat = new Cat( );
        Cat blackCat = new Cat( );
        Cat strayCat = new Cat( );
        strayCat = (Cat) whiteCat;
        blackCat = (Cat) strayCat;
    }
}
class Vertebrate { }
class Cat extends Vertebrate { }
