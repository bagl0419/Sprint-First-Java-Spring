package bitlab.techorda.g1.sprintfirst.controller;

import bitlab.techorda.g1.sprintfirst.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import bitlab.techorda.g1.sprintfirst.service.StudentService;

import java.util.List;

@Controller
public class HomeController {
    private final StudentService studentService;

    public HomeController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String getAllStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }

    @PostMapping("/")
    public String addStudent(@RequestParam String name, @RequestParam String surname, @RequestParam int exam) {
        studentService.addStudent(name, surname, exam);
        return "redirect:/";
    }
}

