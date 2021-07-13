package sa.fisal7.lib;

public class Person {
    private static String Gender;
    private String austin;
    private String gender;
    private int i;
    private String seattle;

    public Person(String austin, String gender, int i, String seattle) {

        this.austin = austin;
        this.gender = gender;
        this.i = i;
        this.seattle = seattle;
    }


    public String getAustin() {
        return austin;
    }

    public void setAustin(String austin) {
        this.austin = austin;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getSeattle() {
        return seattle;
    }

    public void setSeattle(String seattle) {
        this.seattle = seattle;
    }
}
