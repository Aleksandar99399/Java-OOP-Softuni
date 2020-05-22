package src.WorkingWithAbstractionLab.StudentSystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }



    private String createCommentary() {
        if (this.getGrade() >= 5.00) {
            return  "Excellent student.";
        } else if (this.getGrade() < 5.00 && this.getGrade() >= 3.50) {
            return "Average student.";
        } else {
            return  "Very nice person.";
        }

    }

    @Override
    public String toString() {
        return String.format("%s is %s years old. %s",
                this.getName(),
                this.getAge(),
                this.createCommentary());


    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public double getGrade() {
        return this.grade;
    }
}
