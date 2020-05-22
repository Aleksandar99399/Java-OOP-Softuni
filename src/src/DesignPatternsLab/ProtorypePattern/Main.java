package src.DesignPatternsLab.ProtorypePattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shape firstCircle=new Circle("Green",new ArrayList<>(List.of("Great Success")));

        Circle secondCircle = (Circle) firstCircle.clone();
        secondCircle.getText().add("I'm second");

        draw(firstCircle);
        draw(secondCircle);

    }
    public static void draw(Shape shape){
        System.out.println(shape.toString());
    }
}
