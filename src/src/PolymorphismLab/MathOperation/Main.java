package src.PolymorphismLab.MathOperation;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(in);
        var mathOperation=new MathOperation();

        System.out.println(mathOperation.add(2, 2));
        System.out.println(mathOperation.add(3, 3,3));
        System.out.println(mathOperation.add(4, 4,4,4));
    }
}

