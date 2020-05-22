package src.WorkingWithAbstractionLab.StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class InMemoryStudentsRepository implements StudentsRepository {

    private final Map<String, Student> map;

    public InMemoryStudentsRepository(){
        this.map=new HashMap<>();
    }

    @Override
    public boolean containsStudentWith(String name) {
        return map.containsKey(name);
    }

    @Override
    public Student findBy(String name) {
        return map.get(name);
    }

    @Override
    public void save(Student student) {
        map.put(student.getName(),student);
    }
}
