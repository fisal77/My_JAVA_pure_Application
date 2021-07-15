package sa.fisal7.lib;

class Fish {
    int numFins;
    int numGills;
    public Fish( ) {
        numFins = 3;
        numGills = 2;
    }
    public Fish(int nFins, int nGills) {
        numFins = nFins;
        numGills = nGills;
    }
    public static void main(String[ ] args) {
        AngelFish angelFish = new AngelFish(4, 3, "Black, Silver");
        AngelFish angelFish2 = new AngelFish( );
    }
}
class AngelFish extends Fish {
    String colors;
    public AngelFish(int fins, int gills, String fColors) {
        super(fins, gills);
        colors = fColors;
    }
    public AngelFish( ) {
        super(2, 3);


        colors = "Silver";


    }
}
