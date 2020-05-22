package src.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static src.company.Client.*;
import static src.company.Director.*;
import static src.company.Utilites.*;

public class Main {

    public static final double PRICE = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Director director = new Director();
        MusicCompany mc = new MusicCompany();
        List<Client> clients = new ArrayList<Client>();
        List<Director> directors = new ArrayList<Director>();

        init(sc, director);

        directors.add(director);

        int cases;
        while (!sc.equals("exit")) {
            System.out.println("Welcome to " + director.getCompanyName());
            System.out.println("Enter step : ");
            System.out.println("1.Create client.");
            System.out.println("2.List all the clients.");
            System.out.println("3.Change price per hour.");
            System.out.println("4.Check profit.");
            System.out.println("5.Create company.");
            System.out.println("6.List companies.");


            cases = sc.nextInt();
            switch (cases) {
                case 1:
                    createClient(clients,director);
                    break;
                case 2:
                    listClients(clients);
                    break;
                case 3:
                    changePricePerHour(sc,mc);
                    break;
                case 4:
                    checkProfit(clients);
                    break;
                case 5:
                    createDirector(directors);
                    break;
                case 6:
                    listCompanies(directors);
                    break;
                default:
                    break;
            }
        }
        System.out.println("You successfully exited the program.");
    }
}
