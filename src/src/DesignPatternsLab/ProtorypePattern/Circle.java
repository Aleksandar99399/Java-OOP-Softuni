package src.DesignPatternsLab.ProtorypePattern;

import java.util.ArrayList;
import java.util.List;

public class Circle implements Shape {
    private String core;
    private List<String> text;

    public Circle(String core, List<String> text) {
        this.core = core;
        this.text = text;
    }

    public List<String> getText() {
        return text;
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        Circle clone = (Circle) super.clone();
        clone.text=new ArrayList<>(clone.text);
        return clone;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "core='" + core + '\'' +
                ", text=" + text +
                '}';
    }
}
