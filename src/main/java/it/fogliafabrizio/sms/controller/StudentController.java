package it.fogliafabrizio.sms.controller;

import it.fogliafabrizio.sms.entity.Student;
import it.fogliafabrizio.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private StudentService studentService; // Costuctor Depency Injection

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    /* Handler Method to handle lists students and return mode and view  */
    @GetMapping("/students")
    public String listStudent(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        // Create Student Object
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") Student student,
                                Model model){

        // Get Student by ID
        Student existing_student = studentService.getStudentById(id);
        existing_student.setId(id);
        existing_student.setFirstName(student.getFirstName());
        existing_student.setLastName(student.getLastName());
        existing_student.setEmail(student.getEmail());

        // Save updated student
        studentService.updateStudent(existing_student);

        return "redirect:/students";

    }
}
