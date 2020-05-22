package src.WorkingWithAbstractionLab.StudentSystem;

public class StudentSystem {

    private StudentsRepository repo;

    public StudentSystem(StudentsRepository repo){
        this.repo=repo;
    }


    public String studentInformationFor(String name) {
        if (repo.containsStudentWith(name)) {
            Student student = repo.findBy(name);
            return student.toString();
        }
        return null;
    }

    public void persistUniqueStudent(Student student) {
        if (!repo.containsStudentWith(student.getName())) {

            repo.save(student);
        }
    }


}