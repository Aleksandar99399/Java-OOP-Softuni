package src.WorkingWithAbstractionLab.Point;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Point bottomLeft=getPoint(scanner);
        Point topRight=getPoint(scanner);

        Rectangle rectangle=new Rectangle(bottomLeft,topRight);


        int numberOfPoints=scanner.nextInt();

        for (int i = 0; i < numberOfPoints; i++) {
            Point point = getPoint(scanner);
            System.out.println(rectangle.contains(point));

        }
    }

    private static Point getPoint(Scanner scanner) {
        int pointX=scanner.nextInt();
        int pointY=scanner.nextInt();
        return new Point(pointX,pointY);
    }
}
