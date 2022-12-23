package rifqidzulfikar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rifqidzulfikar.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
