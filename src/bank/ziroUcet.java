package bank;

public class ziroUcet extends ucet {
    // metoda vyber() musi byt odlisna
    // musime povolit vyber do minusu
    // method overriding! resp prekryti

    // protoze stav je private, neni dostupny pro potomka
    // reseni: v uctu() vytvorime metodu protected setStav
    // protected poskytuje jen pro potomky

    private double limit=0;

    public ziroUcet(int cisloUctu, String vlastnik, double pocatecniVklad, double limit) {
        super(cisloUctu,vlastnik,pocatecniVklad); // volame rodicovo kontruktor, ten ma tri argumenty
        this.limit=limit;
    }
    // KONSTRUKTORY PREDKA SE NEDEDI


    public ziroUcet(int cisloUctu, String vlastnik, double pocatecniVklad) {
        this(cisloUctu, vlastnik, pocatecniVklad, 0);
    }

    public ziroUcet(int cisloUctu, String vlastnik){
        this(cisloUctu,vlastnik,0,0);
    }


    public boolean vyber(double castka){
        if((getStav()+limit-castka) >= 0) {
            setStav(getStav()-castka);
            return true;
        }
        else {
            return false;
        }
    }
    public double getLimit() {
        return limit;
    }
}
