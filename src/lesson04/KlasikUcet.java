package lesson04;
// Poplatky pri vyberu
public class KlasikUcet extends absUcet {

    private double poplatek;

    // ----------------CONTRUCTORS------------
    public KlasikUcet(String vlastnik, int cisloUctu, double pocatecniVklad, double poplatek) {
        super(vlastnik, cisloUctu, pocatecniVklad);
        this.poplatek = poplatek;
    }
    public KlasikUcet(String vlastnik, int cisloUctu, double poplatek) {
        super(vlastnik, cisloUctu);
        this.poplatek = poplatek;
    }

    // ------------------METHODS------------
    public boolean vyber(double castka){
        if(castka+poplatek<this.getStav()){
            this.setStav(this.getStav() - castka - poplatek);
            return true;
        }
        else{return false;}
    }

    public void eod(int days){
        System.out.println(days+" days passed by...");
        info();
    }

    public void info(){
        System.out.println("This is Regular account");
        System.out.print("Owner: "+this.getVlastnik());
        System.out.println("    Acc num: "+this.getCisloUctu());
        System.out.println("    Acc bal: "+this.getStav());
    }
}
