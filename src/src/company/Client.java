package src.company;

import java.util.List;
import java.util.Scanner;

import static src.company.Utilites.collectProfit;
import static src.company.Utilites.rentStudio;

public class Client {

    private String clientName;
    public int rentingHours;
    private double money;

    public Client(){}

    public Client(String clientName, int rentingHours, double money) {
        this.clientName = clientName;
        this.rentingHours = rentingHours;
        this.money = money;
    }

    public static List<Client> createClient(List<Client> clients, Director director){
        Client client = new Client();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the client : ");
        String clientName = sc.nextLine();
        System.out.println("Enter the renting hours : ");
        int rentingHours = sc.nextInt();

        client.setClientName(clientName);
        client.setRentingHours(rentingHours);

        clients.add(client);

        if(rentStudio (clients,director)){
            double rent = collectProfit(clients,director);

            System.out.println("You successfully rented the studio.");
            System.out.println("Your bill is : " + rent + "BGN");
            client.setMoney(rent);
            listClients(clients);
        } else {
            clients.remove(clients.size()-1);
            System.out.println("Not enough free hours. Try again!");
            System.out.println("------------------------------------");

        }

        return clients;
    }

    public static String listClients(List<Client> clients){

        String list = "";
        System.out.println("------------------------------");
        for (Client client : clients){
            System.out.println(client);
        }
        System.out.println("------------------------------");

        return list;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getRentingHours() {
        return rentingHours;
    }

    public void setRentingHours(int rentingHours) {
        this.rentingHours = rentingHours;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Client Name : " + getClientName() + " | Client's renting hours : " + getRentingHours() + " | Client's bill : " + getMoney();
    }
}
