package lesson04;
// eod() zuctovani ke konci dne
// ucty jsou tri: beznej, sporici, ziro

public abstract class absUcet {
    private String vlastnik;
    private int cisloUctu;
    private double stav = 0;

    //--------------CONSTRUCTORS-------------
    // Two argument constructor
    public absUcet(String vlastnik, int cisloUctu) {
        this.vlastnik = vlastnik;
        this.cisloUctu = cisloUctu;
    }
    // Three argument constructor
    public absUcet(String vlastnik, int cisloUctu, double pocatecniVklad) {
        this.vlastnik = vlastnik;
        this.cisloUctu = cisloUctu;
        this.stav+=pocatecniVklad;
    }
    //-----------------METHODS-------------
    public double getStav() {
        return stav;
    }
    protected void setStav(double stav) {
        this.stav = stav;
    }
    public int getCisloUctu() {
        return cisloUctu;
    }
    public String getVlastnik() {
        return vlastnik;
    }

    protected void vklad(double castka) {
        setStav(this.stav+castka);
    }
    public boolean vyber(double castka){
        if(castka<this.getStav()){
            this.setStav(this.getStav() - castka);
            return true;
        }
        else{return false;}
    }
    public void eod(int days){
        this.setStav(this.getStav());
        System.out.println(days+" passed by...");
        info();
    }

    // every abstract method has to be rewritten
    public abstract void info();                   // "What is this?"
}
