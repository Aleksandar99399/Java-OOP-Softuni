package src.company;

import java.util.List;
import java.util.Scanner;

import static src.company.Main.PRICE;

public class Utilites {

    public static void init(Scanner sc, Director director) {

        System.out.println("Enter the name of the director : ");
        String directorName = sc.nextLine();
        director.setName(directorName);

        System.out.println("Enter the age of the director : ");
        int age = sc.nextInt();
        sc.nextLine();
        director.setAge(age);

        System.out.println("Enter the name of the music company : ");
        String companyName = sc.nextLine();
        director.setCompanyName(companyName);


        System.out.println("Enter the hours of the music company : ");
        int workingHours = sc.nextInt();
        sc.nextLine();
        director.setWorkingHours(workingHours);

        director.setPricePerHour(PRICE);

        director.setProfit(0);


    }

    public static boolean rentStudio(List<Client> clients, Director director) {
        int hoursLeft;

        System.out.println("------------------------------------");
        if (clients.get(clients.size()-1).rentingHours <= director.getWorkingHours()) {
            hoursLeft = director.getWorkingHours() - clients.get(clients.size()-1).rentingHours;
            director.setWorkingHours(hoursLeft);
            System.out.println(hoursLeft + " hours left for today.");
            return true;
        } else {
            System.out.println("No more hours left for today!");
            return false;

        }
    }

    public static double collectProfit(List<Client> clients, MusicCompany mc){
        double profit;
        profit = clients.get(clients.size() - 1).rentingHours * mc.getPricePerHour();
        mc.setProfit(profit);
        return profit;
    }

    public static void checkProfit(List<Client> clients){
        double profit = 0;

        for (Client client : clients){
            profit += client.getMoney();
        }
        System.out.println("------------------------------------");
        System.out.println("The profit of the company is : " + profit + " BGN");
        System.out.println("The profit of the company is : " + dollarProfit(profit) + " USD");
        System.out.println("The profit of the company is : " + euroProfit(profit) + " EUR");
        System.out.println("------------------------------------");
    }

    public static void changePricePerHour(Scanner sc, MusicCompany mc){
        System.out.println("------------------------------------");
        System.out.println("Enter new price per hour :");
        double newPrice = sc.nextDouble();
        if(newPrice < PRICE){
            System.out.println("The new price should not be less than the minimal price. ( " + PRICE + " BGN )");
        } else {
            mc.setPricePerHour(newPrice);
            System.out.println("The new price per hour is : " + mc.getPricePerHour());
        }
        System.out.println("------------------------------------");
    }

    public static double dollarProfit(double value) {
        return value * 1.77;
    }

    public static double euroProfit(double value) {
        return value * 1.96;
    }
}
