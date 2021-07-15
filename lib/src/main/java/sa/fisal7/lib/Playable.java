package sa.fisal7.lib;

interface Playable {
    public void play( );
}

class Instrument implements Playable {
    public void play( ) {
        System.out.println("music");
    }
}

class StringedInstrument extends Instrument {
    public void play( ) {
        System.out.println("stringed instrument");
    }
}

class Violin extends StringedInstrument {
    public void play( ) {
        System.out.println("pluck");
    }
}

class Drum extends Instrument {
    public void play( ) {
        System.out.println("beat");
    }
}

class PlayMusic {
    public static void main(String[ ] args) {
        Playable[ ] myInstruments = {new Instrument( ), new Violin( ), new Drum( )};
        for (Playable x: myInstruments) {
            x.play( );
        }
    }
}
