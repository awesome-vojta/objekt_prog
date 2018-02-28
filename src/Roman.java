public class Roman {
    static class Dvojice {
        int arab;
        String roman;

        Dvojice(int arab, String roman) {
            this.arab = arab;
            this.roman = roman;
        }
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(toRoman(n));
//        System.out.println(fromRoman(toRoman(n)));
        System.out.println(toRoman(3999));
        System.out.println(fromRoman("MMMCMXCIX"));
    }

    static Dvojice tabulka[] = {
            new Dvojice(1000, "M"),
            new Dvojice(900, "CM"),
            new Dvojice(500, "D"),
            new Dvojice(400, "CD"),
            new Dvojice(100, "C"),
            new Dvojice(90, "XC"),
            new Dvojice(50, "L"),
            new Dvojice(40, "XL"),
            new Dvojice(10, "X"),
            new Dvojice(9, "IX"),
            new Dvojice(5, "V"),
            new Dvojice(4, "IV"),
            new Dvojice(1, "I")
    };

    public static String toRoman (int i) throws IllegalArgumentException {
        if ((i > 3999)||(i<= 0))throw new IllegalArgumentException();
        else {
            int cislo = i;
            String vysl="";
            while (cislo > 0) {
                for (int j=0; j < tabulka.length; j++) {
                    if (cislo >= tabulka[j].arab) {
                        vysl=vysl+tabulka[j].roman;
                        cislo=cislo-tabulka[j].arab;
                        break;
                    }
                }
            }
            return vysl;
        }
    }

    public static int fromRoman(String ss) throws NumberFormatException {
        String s = ""+ss;
        if (s.length() == 0) {
            throw new NumberFormatException(ss);
        }
        int l;
        int vysl = 0;
        while (s.length() != 0) {
            l=s.length();
            for (int i = 0; i < tabulka.length; i++) {
                if (s.startsWith(tabulka[i].roman)) {
                    vysl += tabulka[i].arab;
                    s=s.substring(tabulka[i].roman.length());
                    break;
                }
            }
            if(s.length() == 1) {
                throw new NumberFormatException(ss);
            }
        }
        return vysl;
    }
}
