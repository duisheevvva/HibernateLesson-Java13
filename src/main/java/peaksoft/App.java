package peaksoft;

import org.hibernate.SessionFactory;
import peaksoft.config.HibernateConfig;
import peaksoft.dao.CourseDao;
import peaksoft.entity.Course;
import peaksoft.entity.Student;
import peaksoft.enums.Gender;
import peaksoft.service.CourseService;
import peaksoft.service.StudentService;
import peaksoft.service.serviceImpl.CourseServiceImpl;
import peaksoft.service.serviceImpl.StudentServiceImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        CourseService courseService = new CourseServiceImpl();
//        System.out.println(courseService.saveCourse(new Course("JS", 14000)));
//        System.out.println(courseService.getCourseById(2L));
//        System.out.println(courseService.updateCourse(2L, new Course("Python", 10000)));
        courseService.deleteCourseById(2L);


    }

}
