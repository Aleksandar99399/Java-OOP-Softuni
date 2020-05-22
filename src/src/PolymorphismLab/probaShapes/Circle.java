package src.PolymorphismLab.probaShapes;

public class Circle extends Shape {

    private Double radius;

    public Circle (Double radius) {

        this.setRadius(radius);

        this.calculatePerimeter();

        this.calculateArea();

    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public final Double getRadius() {

        return radius;

    }
    @Override
    protected void calculatePerimeter() {
        setRadius(2 * Math.PI * radius);
    }

    @Override
    protected void calculateArea() {
        setRadius(Math.PI * (radius * radius));
    }
}
