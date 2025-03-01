package presentation;

import dao.DaoImpl;
import metier.IMetier;
import metier.MetierImpl;

public class presentationV1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl m = new MetierImpl();
        m.setDao(dao);
        System.out.println("Res="+m.calcul());
    }
}
