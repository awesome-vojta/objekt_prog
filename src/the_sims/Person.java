package the_sims;

public class Person {
    private char identifier;
    private int x;
    private int y;
    private String gender;

    public int[] getPosition() {
        int[] pos = {x,y};
        return pos;
    }
}
