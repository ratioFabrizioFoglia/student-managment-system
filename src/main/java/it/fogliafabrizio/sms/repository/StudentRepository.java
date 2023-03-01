package it.fogliafabrizio.sms.repository;

import it.fogliafabrizio.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Non va messo @Repository perchè JPARepository è già
    //  implementato con SimpleJPARepository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
