package the_sims;

public class Field {
    public int width;
    public int height;
    static int[][] field;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        this.field = new int[width][height];
    }

    public boolean addPerson(Person p) {
       return true;
    }
}
