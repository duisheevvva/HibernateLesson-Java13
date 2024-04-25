package peaksoft.service.serviceImpl;

import peaksoft.dao.CourseDao;
import peaksoft.dao.daoImpl.CourseDaoImpl;
import peaksoft.entity.Course;
import peaksoft.service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    CourseDao courseDao = new CourseDaoImpl();
    @Override
    public String saveCourse(Course newCourse) {
        return courseDao.saveCourse(newCourse);
    }

    @Override
    public Course getCourseById(Long courseId) {
        return courseDao.getCourseById(courseId);
    }

    @Override
    public String updateCourse(Long oldCourseId, Course newCourse) {
        return courseDao.updateCourse(oldCourseId,newCourse);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }

    @Override
    public String deleteCourseById(Long courseId) {
        return courseDao.deleteCourseById(courseId);
    }
}
