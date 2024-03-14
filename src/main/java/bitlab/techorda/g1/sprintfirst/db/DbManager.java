package bitlab.techorda.g1.sprintfirst.db;


import bitlab.techorda.g1.sprintfirst.model.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DbManager {
    @Getter
    private static List<Student> students = new ArrayList<>();


    static {
        students.add(new Student(1L, "Баглан", "Иманбеков", 85, "B"));
        students.add(new Student(2L, "Джон", "До", 95, "A"));
        students.add(new Student(3L, "Елена", "Смирнова", 65, "D"));
        students.add(new Student(4L, "Ерасыл", "Абдибеков",33 , "F"));
        students.add(new Student(5L, "Адильжан", "Каримов",45 , "F"));
        students.add(new Student(6L, "Акерке", "Елеусизова", 92, "A"));
        students.add(new Student(7L, "Алина", "Каламкасова", 97, "A"));
    }
}
