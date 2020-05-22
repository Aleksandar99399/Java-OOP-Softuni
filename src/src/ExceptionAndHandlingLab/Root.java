package src.ExceptionAndHandlingLab;

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        try{
            getSqrt(n);
        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }finally {
            System.out.println("Good bye");
        }

    }

    private static void getSqrt(int n) {
        double sqrt = Math.sqrt(n);
        if (Double.isNaN(sqrt)){
            throw new ArithmeticException("Invalid number");
        }
        System.out.println(sqrt);
    }
}
