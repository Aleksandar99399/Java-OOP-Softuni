package src.PolymorphismLab.probaShapes;

public class Main {
    public static void main(String[] args) {
        Shape rectangle=new Rectangle(5.0,3.0);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
