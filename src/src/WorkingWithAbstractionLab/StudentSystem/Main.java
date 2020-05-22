package src.WorkingWithAbstractionLab.StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem(new InMemoryStudentsRepository());
        StudentSystemInputParser parser=new StudentSystemInputParser();
        while (true) {
            String[] input = scanner.nextLine().split(" ");
            String commands=input[0];

            switch (commands){
                case "Exit":
                    return;
                case "Create":
                    Student student = parser.createStudent(input);
                    studentSystem.persistUniqueStudent(student);
                    break;
                case "Show":
                    String output=studentSystem.studentInformationFor(input[1]);
                    if (output!=null){
                        System.out.println(output);
                    }
                    break;
            }

        }
    }

}
