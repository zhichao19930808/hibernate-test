package xin.zcglory;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import xin.zcglory.entity.Student;

import java.util.List;

public class QueryBySql {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();

        Session session = factory.getCurrentSession();
        session.getTransaction().begin();

        String sql = "select * from student";
        SQLQuery query = session.createSQLQuery(sql);
        List<Student> students = query.addEntity(Student.class).list();
        for (Student student : students) {
            System.out.println(student);
        }


        session.getTransaction().commit();
        factory.close();
    }
}
