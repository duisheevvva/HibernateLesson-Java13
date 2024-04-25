package peaksoft.dao.daoImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import org.hibernate.HibernateException;
import peaksoft.config.HibernateConfig;
import peaksoft.dao.CourseDao;
import peaksoft.entity.Course;

import java.util.List;

public class CourseDaoImpl implements CourseDao {
    EntityManagerFactory entityManagerFactory = HibernateConfig.getEntityManagerFactory();
    @Override
    public String saveCourse(Course newCourse) {
        try(EntityManager entityManager = entityManagerFactory.createEntityManager()){
            entityManager.getTransaction().begin();
            entityManager.persist(newCourse);
            entityManager.getTransaction().commit();
            return "Success";
        }catch (HibernateException e){
            return e.getMessage();
        }
    }

    @Override
    public Course getCourseById(Long courseId) {
        try(EntityManager entityManager = entityManagerFactory.createEntityManager()) {
            entityManager.getTransaction().begin();
//            with java code:
            entityManager.find(Course.class, courseId);
//            with query:
            Query query = entityManager.createQuery("select c from Course c where c.id = :courseId")
                    .setParameter("courseId", courseId);
            Course getCourse = (Course) query.getSingleResult();
            entityManager.getTransaction().commit();
            return getCourse;
        }catch (HibernateException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String updateCourse(Long oldCourseId, Course newCourse) {
        try(EntityManager entityManager = entityManagerFactory.createEntityManager()){
            entityManager.getTransaction().begin();
            entityManager.createQuery("update Course c set c.courseName =:courseName,c.price=:price where c.id =:courseId")
                    .setParameter("courseName",newCourse.getCourseName())
                    .setParameter("price",newCourse.getPrice())
                    .setParameter("courseId",oldCourseId)
                    .executeUpdate();
            entityManager.getTransaction().commit();
            return "Success";
        }catch (HibernateException e){
            return e.getMessage();
        }

    }

    @Override
    public List<Course> getAllCourses() {
        return null;
    }

    @Override
    public String deleteCourseById(Long courseId) {
        try(EntityManager entityManager = entityManagerFactory.createEntityManager()){
            entityManager.getTransaction().begin();
            entityManager.createQuery("delete from Course c where c.id = :courseId")
                    .setParameter("courseId",courseId)
                    .executeUpdate();
            entityManager.getTransaction().commit();
            return "success";
        }catch (HibernateException e){
            return e.getMessage();
        }
    }
}
