package sa.fisal7.lib;

public abstract class Animal_Abstract {
    private int height;
    private int mass;
    public abstract void move( );
    public void setSize (int height, int mass) {
        this.height = height;
        this.mass = mass;
    }
}

