package it.fogliafabrizio.sms;

import it.fogliafabrizio.sms.entity.Student;
import it.fogliafabrizio.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Fabrizio", "Foglia", "fabrizio.foglia@gmail.com");
//		Student student2 = new Student("Paolo", "Foglia", "paolo.foglia@gmail.com");
//		Student student3 = new Student("Alessandro", "Vignotto", "alessandro.vignotto@gmail.com");
//		studentRepository.save(student1);
//		studentRepository.save(student2);
//		studentRepository.save(student3);
	}
}
