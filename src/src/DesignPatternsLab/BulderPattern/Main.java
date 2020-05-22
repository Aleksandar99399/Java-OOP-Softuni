package src.DesignPatternsLab.BulderPattern;

public class Main {
    public static void main(String[] args) {
        Address address=Address.builder()
                .withCity("Sofiq")
                .withCountry("Bulgaria")
                .build();

    }
}
