package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Vesion base de données");
        double tmp=23;
        return tmp;
    }
}
