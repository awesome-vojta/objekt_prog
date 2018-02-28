package bank;

public class ucet {
    private int cisloUctu;
    private String vlastnik;
    private double stav=0;

    public ucet(int cisloUctu, String vlastnik, double pocatecniVklad){
        this.cisloUctu=cisloUctu; //contructor
        this.vlastnik=vlastnik;
        this.stav=pocatecniVklad;
    }

    public ucet(int cisloUctu, String vlastnik) {
        this(cisloUctu,vlastnik,0); // contructor
    }



    protected void setStav(double stav) { // tato metoda je pristupna pouze pro potomky
        this.stav = stav;
    }

    public double getStav() {
        return stav;
    }
    public void vloz(double castka) {
        stav+=castka;
    }

    public boolean vyber(double castka) {
        if ((stav - castka) >= 0) {
            stav=stav-castka;
            return true;
        }
        else {
            return false;
        }
    }

    public void info() {
        System.out.println("klasik ucet");
        System.out.println(vlastnik);
        System.out.println(stav);
        System.out.println(cisloUctu);
    }

}
