package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Vesion base de données");
        double tmp=23;
        return tmp;
    }
}
