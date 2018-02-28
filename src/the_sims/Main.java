package the_sims;

public class Main {
    public static void main(String[] args) {
        char[][] list = new char[3][3];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                System.out.print(list[i][j]);
            }
        }
    }
}
