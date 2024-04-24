package peaksoft;

import peaksoft.entity.Student;
import peaksoft.enums.Gender;
import peaksoft.service.StudentService;
import peaksoft.service.serviceImpl.StudentServiceImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        StudentService studentService = new StudentServiceImpl();
//        studentService.saveStudent(new Student("SultanAli","Kaldarbekov","sultanAli@gmail.com",19, Gender.MALE));
//        System.out.println(studentService.getStudentById(2L));
//        System.out.println(studentService.getAllStudents());
//        System.out.println(studentService.updateStudent(3L, new Student("Muktar", "Elebesov", "muktar@gmail.com", 19, Gender.MALE)));
        System.out.println(studentService.deleteStudentById(4L));

    }

}
