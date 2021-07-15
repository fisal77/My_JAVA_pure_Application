package sa.fisal7.lib;

interface One {
    void firstMethod( );
}
interface Two {
    abstract void secondMethod( );
}
interface Three extends One, Two {
    void thirdMethod( );
}
class Four implements Three {
    public void firstMethod( ) {

    }
    public void secondMethod( ) {

    }
    public void thirdMethod( ) {

    }
}
