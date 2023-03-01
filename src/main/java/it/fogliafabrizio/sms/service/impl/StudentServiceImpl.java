package it.fogliafabrizio.sms.service.impl;

import it.fogliafabrizio.sms.entity.Student;
import it.fogliafabrizio.sms.repository.StudentRepository;
import it.fogliafabrizio.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository; // Injection Dependency - @Autowired o Cost

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
        /* studentRepository estende la JPARepository quindi ha tutte le funzioni CRUD base
        *       findAll() torna una lista di String
        * */
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }
}
