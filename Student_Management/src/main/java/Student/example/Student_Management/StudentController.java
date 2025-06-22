package Student.example.Student_Management;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/student")
    public List<Student> getStudents() {
        List<Student> list = studentRepo.findAll();
        return list;
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id) {
        Student student = studentRepo.findById(id).get();
        return student;
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id) {
        Student student = studentRepo.findById(id).get();
        studentRepo.delete(student);
    }


}
