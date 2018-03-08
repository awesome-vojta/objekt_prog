package lesson04;

public class anotherBank {
    public static void main(String[] args) {
        ZiroUcet ziro = new ZiroUcet("zirak",1,1000, 100);
        KlasikUcet klasik = new KlasikUcet("klassa",2,1000,20);
        SporiciUcet sporici = new SporiciUcet("sporak",3,100,1);

        ziro.setStav(100);
        System.out.println(ziro.vyber(110));
        System.out.println(ziro.getStav());
        System.out.println(ziro.getCisloUctu());
        System.out.println(ziro.getVlastnik());
        System.out.println(ziro.getLimit());

        System.out.println("--------");

        klasik.setStav(100);
        System.out.println(klasik.vyber(110));
        System.out.println(klasik.getStav());
        System.out.println(klasik.vyber(20));
        System.out.println(klasik.getStav());

        System.out.println("--------");
        sporici.setStav(100);
        System.out.println(sporici.vyber(110));
        System.out.println(sporici.getStav());
        sporici.eod(20);
        System.out.println(sporici.getStav());







    }
}
