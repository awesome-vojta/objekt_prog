package lesson04;
// muzes vybrat do nuly

public class ZiroUcet extends absUcet {
    private double limit;

//           -----------------CONTRUCTORS---------------
    public ZiroUcet(String vlastnik, int cisloUctu, double pocatecniVklad, double limit) {
        super(vlastnik, cisloUctu, pocatecniVklad);
        this.limit = limit;
    }
    public ZiroUcet(String vlastnik, int cisloUctu, double limit) {
        super(vlastnik, cisloUctu);
        this.limit = limit;
    }


//          -------------------METHODS-------------------
    public double getLimit() {
        return limit;
    }

    public boolean vyber(double castka){
        if(castka<this.getStav()+limit){ // We can withdraw from stav and limit
            this.setStav(this.getStav() - castka);
            return true;
        }
        else{return false;}
    }
    public void eod(int days){
        this.setStav(this.getStav());
        System.out.println(days+" days passed by...");
        info();
    }
    public void info(){
        System.out.println("This is -ZiroUcet-");
        System.out.print("Owner: "+this.getVlastnik());
        System.out.println("    Acc num: "+this.getCisloUctu());
        System.out.print("Acc lim: "+this.getLimit());
        System.out.println("    Acc bal: "+this.getStav());
    }


// TODO:  random cisloUctu
    // TODO: other classes
}
