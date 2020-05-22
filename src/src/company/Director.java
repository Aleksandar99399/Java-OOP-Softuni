package src.company;

import java.util.List;
import java.util.Scanner;

public class Director extends MusicCompany {

    private String directorName;
    private int age;
    private int id=1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Director (){
    }

    public Director(String directorName, int age){
        this.directorName = directorName;
        this.age = age;
    }

    public static void createDirector(List<Director> directors) {
        Director director = new Director();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the director : ");
        String directorName = sc.nextLine();
        System.out.println("Enter age of the director : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name of the company : ");
        String companyName = sc.nextLine();
        System.out.println("Enter price per hour : ");
        double pricePerHour = Double.parseDouble(sc.nextLine());
        //sc.nextLine();

        director.setName(directorName);
        director.setAge(age);
        director.setCompanyName(companyName);
        director.setPricePerHour(pricePerHour);

        director.setId(director.getId()+1);


        directors.add(director);

        listCompanies(directors);
    }

    public static MusicCompany createCompany(String companyName, double pricePerHour,int workingHour){

        return new MusicCompany(companyName,pricePerHour,workingHour);
    }


    public static void listCompanies(List<Director> directors){


        System.out.println("------------------------------");
        for (Director director : directors){
            System.out.println(director);
        }
        System.out.println("------------------------------");


    }


    public String getDirectorName() {
        return directorName;
    }

    public void setName(String name) {
        this.directorName = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID "+getId()+" Director's name : " + getDirectorName() + " | Director's age : " + getAge() + " | Company's name : " + getCompanyName() + " | Price per hour : " +getPricePerHour();
    }
}
