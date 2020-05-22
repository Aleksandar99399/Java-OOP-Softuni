package src.WorkingWithAbstractionLab.enumdem;

public enum CoffeSize {
    Small(100),
    Normal(150),
    Double(200);

    private int size;

    CoffeSize(int size){
        this.size=size;
    }

    public int getSize() {
        return size;
    }
}
