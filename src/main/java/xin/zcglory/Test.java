package xin.zcglory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import xin.zcglory.entity.Student;

import java.sql.Date;

/***
 * 基本查询
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student("张三","北京",new Date(System.currentTimeMillis()));
        Student student1 = new Student(1,"李四","北京",new Date(System.currentTimeMillis()));
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();

        Session session = factory.getCurrentSession();
        session.getTransaction().begin();

        //存入一名学生的信息
        session.save(student);
        //修改一名学生的信息
//        session.update(student1);
        //通过id获取到一名学生
//        Student student2 = session.get(Student.class, 1);
//        Student student2 = session.load(Student.class, 1);
//        System.out.println("****************************************************\n"+student2.getName()+"\n****************************************************");
        //删除一名学生（通过id删除，其他数据无所谓）
//        session.delete(student2);

        session.getTransaction().commit();
        factory.close();
    }
}
