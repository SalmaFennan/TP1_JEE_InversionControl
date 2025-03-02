package presentation;

import dao.DaoImpl;

import metier.MetierImpl;

public class presentationV1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl m = new MetierImpl(dao);//injection des dependances via le constructeur
        m.setDao(dao);//injection via le setter
        System.out.println("Res="+m.calcul());
    }
}
