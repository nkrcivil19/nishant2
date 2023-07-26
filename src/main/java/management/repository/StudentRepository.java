package management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import management.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
