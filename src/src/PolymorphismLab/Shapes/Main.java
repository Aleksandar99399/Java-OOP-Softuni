package src.PolymorphismLab.Shapes;

public class Main {
    public static void main(String[] args) {
        Shape rectangle=new Rectangle(3.0,5.0);
        Shape circle=new Circle(5.0);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
