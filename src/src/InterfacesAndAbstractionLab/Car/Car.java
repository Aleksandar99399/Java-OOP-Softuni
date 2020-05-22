package src.InterfacesAndAbstractionLab.Car;

public interface Car {
    public static final int TIRES=4;

    public abstract String getModel();

    String getColor();

    Integer getHorsePower();

    String countryProduced();

}
