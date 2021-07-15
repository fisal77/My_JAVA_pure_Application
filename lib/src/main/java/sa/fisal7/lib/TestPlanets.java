package sa.fisal7.lib;

public class TestPlanets {

    public static void main(String[ ] args) {
                 Planet earth = new Earth( );
                 System.out.println(earth.rotation( ));

        int x = 0;
        while (x < 5) {
            System.out.print(x + " ");
        }

             }



}


 class Planet {
     int distanceFromSun;
     Planet( ) {
                 System.out.println("This is a Planet");
             }
     Planet(int pDistance) {
                 distanceFromSun = pDistance;
             }
     String rotation( ) {
                return "A Planet rotates";
            }
 }
 class Earth extends Planet {
     String rotation( ) {
               return "The Earth rotates once every 24 hours";
            }
}
 class Jupiter extends Planet {
     String rotation( ) {
                 return "Jupiter rotates once every 9.9 hours";
             }
}
