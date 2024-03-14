package bitlab.techorda.g1.sprintfirst.service;

import bitlab.techorda.g1.sprintfirst.db.DbManager;
import bitlab.techorda.g1.sprintfirst.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return DbManager.getStudents();
    }

    public void addStudent(String name, String surname, int exam) {
        String mark = calculateMark(exam);
        Student student = new Student();
        student.setId((long) (students.size() + 1));
        student.setName(name);
        student.setSurname(surname);
        student.setExam(exam);
        student.setMark(mark);
        students.add(student);
    }

    private String calculateMark(int exam) {
        if (exam >= 90) {
            return "A";
        } else if (exam >= 75) {
            return "B";
        } else if (exam >= 60) {
            return "C";
        } else if (exam >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
