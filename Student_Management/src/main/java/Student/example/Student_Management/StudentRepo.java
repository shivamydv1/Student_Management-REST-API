package Student.example.Student_Management;

import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepo extends JpaRepository<Student, Integer> {


}
