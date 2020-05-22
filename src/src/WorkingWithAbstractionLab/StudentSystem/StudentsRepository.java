package src.WorkingWithAbstractionLab.StudentSystem;

public interface StudentsRepository {

    /**
     * Check weather the repository contains a students with  the given name.
     * @param name of the student to look for.
     * @return true if students is found, false otherwise.
     */
    boolean containsStudentWith(String name);

    /**
     * Given a student name, return the student from the repository.
     * @param name of the student fetch.
     * @return the student with the given name, if found.
     * null if not present.
     */
    Student findBy(String name);

    /**
     * Add student to the repository.
     * @param student to be persisted.
     */
    void save(Student student);
}
