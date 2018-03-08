package lesson04;
// pribejvaj ti penize
public class SporiciUcet extends absUcet {

    private double urok;

    // ----------------CONTRUCTORS------------
    public SporiciUcet(String vlastnik, int cisloUctu, double pocatecniVklad, double urokPercent) {
        super(vlastnik, cisloUctu, pocatecniVklad);
        this.urok = urokPercent/100;
    }
    public SporiciUcet(String vlastnik, int cisloUctu, double urokPercent) {
        super(vlastnik, cisloUctu);
        this.urok = urokPercent/100;
    }

    // ------------------METHODS------------

    public void eod(int days){
        this.setStav(this.getStav()+this.getStav()*urok*days); // + 1% every single day
        System.out.println(days+" days passed by...");
        info();
    }

    public void info(){
        System.out.println("This is Sporici account");
        System.out.print("Owner: "+this.getVlastnik());
        System.out.println("    Acc num: "+this.getCisloUctu());
        System.out.println("    Acc bal: "+this.getStav());
    }


}
