package bank;

import java.util.ArrayList;

public class bank {
    public static void main(String[] args) {
        ArrayList<ucet> list = new ArrayList<ucet>();
        ucet u1 = new ucet(1,"jarda");
        ucet u2 = new ucet(2,"vojta");
        ucet u3 = new ucet(3,"elmar");
        ziroUcet zu1 = new ziroUcet(4,"dluznik");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(zu1);

        for (ucet ucet : list) {
            ucet.info();
        }
    }

}
