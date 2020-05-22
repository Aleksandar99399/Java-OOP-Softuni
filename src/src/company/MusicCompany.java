package src.company;

import static src.company.Main.PRICE;

public class MusicCompany {
    private String companyName;
    private double pricePerHour;
    private int workingHours;
    private double profit;

    public MusicCompany() {
    }

    public MusicCompany(String directorName, int age, String companyName, int workingHours, double pricePerHour, double profit) {
        this.companyName = companyName;
        this.workingHours = workingHours; //Работно време
        this.pricePerHour = pricePerHour; //Цена на час
        this.profit = profit;
    }

    public MusicCompany(String companyName, double pricePerHour,int workingHours ) {
        this.companyName = companyName;
        this.workingHours = workingHours; //Работно време
        this.pricePerHour = pricePerHour; //Цена на час

    }



    public static double increasePrice(MusicCompany musicCompany, double priceDifference) {
        if (musicCompany.getPricePerHour() + priceDifference < PRICE) {
            System.out.println("Invalid increasing of price");
            return musicCompany.getPricePerHour();
        } else if (priceDifference < 0) {
            System.out.println("You cannot increase price with negative number");
            return 0;
        }
        return musicCompany.getPricePerHour() + priceDifference;
    }


    public static double decreasePrice(MusicCompany musicCompany, double priceDifference) {
        if (musicCompany.getPricePerHour() - priceDifference < PRICE) {
            System.out.println("Invalid decreasing of price");
            return musicCompany.getPricePerHour();
        } else if (priceDifference < 0) {
            System.out.println("You cannot decrease price with negative number");
        }
        return musicCompany.getPricePerHour() - priceDifference;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "Company name : " + getCompanyName() + " | Working hours left : " + getWorkingHours() + " | Price per hour : " + getPricePerHour();
    }
}