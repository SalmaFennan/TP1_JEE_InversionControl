package presentation;
import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class presentationV2 {
    public static void main(String[] args) {

        try

        {
            Scanner sc = new Scanner(new File("config.txt"));
            String daoClassname = sc.nextLine();
            System.out.println(daoClassname);
            Class cDao = Class.forName(daoClassname);
            IDao dao=(IDao) cDao.getConstructor().newInstance();

            String metierClassname = sc.nextLine();
            Class cMetier= Class.forName(metierClassname);
            IMetier metier = (IMetier) cMetier.getConstructor().newInstance();
            System.out.println("Res"+metier.calcul());

            Method method = cMetier.getDeclaredMethod("setDao", IDao.class);
            method.invoke(metier,dao);

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

