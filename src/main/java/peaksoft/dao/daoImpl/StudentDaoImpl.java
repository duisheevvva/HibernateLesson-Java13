package peaksoft.dao.daoImpl;

import org.hibernate.Session;

import peaksoft.config.HibernateConfig;
import peaksoft.dao.StudentDao;
import peaksoft.entity.Student;

import java.util.List;

public class StudentDaoImpl implements StudentDao {


//    @Override
//    public String saveStudent(Student student) {
////        Session achyldy:
//        Session session = HibernateConfig.getSession().openSession();
////        transaction bashtadyk
//        session.beginTransaction();
////       insert into nun orduna hibernattin dayar methodu bar : persist
//        session.persist(student);
//        session.getTransaction().commit();
//        session.close();
//        return "Success";
//    }
//
//    @Override
//    public Student getStudentById(Long studentId) {
//        Session session = HibernateConfig.getSession().openSession();
//        session.beginTransaction();
//        Student student = session.get(Student.class, studentId);
//        session.getTransaction().commit();
//        session.close();
//        return student;
//    }
//
//    @Override
//    public List<Student> getAllStudents() {
//        Session session = HibernateConfig.getSession().openSession();
//        session.beginTransaction();
//        List<Student> allStudents =
//                session.createQuery("select s from Student s ", Student.class).getResultList();
//        session.getTransaction().commit();
//        session.close();
//        return allStudents;
//    }
//
//    @Override
//    public Student updateStudent(Long studentId, Student newStudent) {
//        Session session = HibernateConfig.getSession().openSession();
//        session.beginTransaction();
//        Student oldStudent = session.get(Student.class, studentId);
//        oldStudent.setFirstName(newStudent.getFirstName());
//        oldStudent.setLastName(newStudent.getLastName());
//        oldStudent.setEmail(newStudent.getEmail());
//        oldStudent.setAge(newStudent.getAge());
//        oldStudent.setGender(newStudent.getGender());
//        session.getTransaction().commit();
//        session.close();
//        return oldStudent;
//    }
//
////    @Override
////    public String deleteStudentById(Long studentId) {
////        Session session = HibernateConfig.getSession().openSession();
////        session.beginTransaction();
////        Student student = session.get(Student.class, studentId);
////        session.remove(student);
////        session.getTransaction().commit();
////        session.close();
////        return "Successfully deleted!";
////    }
//
//    @Override
//    public String deleteStudentById(Long studentId) {
//        try {
//            Session session = HibernateConfig.getSession().openSession();
//            session.beginTransaction();
//            Student student = session.get(Student.class, studentId);
//            if (student != null) {
//                session.remove(student);
//                session.getTransaction().commit();
//                session.close();
//                return "Successfully deleted!";
//            } else return "Not found!";
//
//        } catch (Exception e) {
//            return e.getMessage();
//        }
//    }
}
