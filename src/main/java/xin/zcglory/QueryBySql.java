package xin.zcglory;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import xin.zcglory.entity.Student;
import xin.zcglory.utils.SessionUtil;

import java.util.List;

public class QueryBySql {
    public static void main(String[] args) {
        Session session =SessionUtil.getSession();
        session.getTransaction().begin();

        //查询全部列
//        String sql = "select * from student";
//        SQLQuery query = session.createSQLQuery(sql);
//        List<Student> students = query.addEntity(Student.class).list();
//        for (Student student : students) {
//            System.out.println(student);
//        }

        //查询部分列
//        String sql = "select t_name,t_address from student";
//        SQLQuery query = session.createSQLQuery(sql);
//        List<Object[]> list = query.addScalar("t_name").addScalar("t_address").list();
//        for (Object[] objects : list) {
//            System.out.println(Arrays.toString(objects));
//        }

        //条件查询
//        String sql = "select * from student where t_name =? ";
//        SQLQuery query = session.createSQLQuery(sql);
////        query.setString(0, "张三");
//        query.setParameter(0, "张三");
//        List<Student> list = query.addEntity(Student.class).list();
//        for (Student student : list) {
//            System.out.println(student);
//        }

        //模糊查询
        String sql = "select * from student where t_name like ? ";
        SQLQuery query = session.createSQLQuery(sql);
        query.setParameter(0, "%"+"张三"+"%");
        List<Student> list = query.addEntity(Student.class).list();
        for (Student student : list) {
            System.out.println(student);
        }

        session.getTransaction().commit();
        SessionUtil.close();
    }
}
