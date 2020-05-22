package src.ExceptionAndHandlingLab;

import java.util.Scanner;

import static java.lang.System.in;

public class EnterNumbers {
    public static void main(String[] args) {


        printAndReadInRange();

    }

    private static void printAndReadInRange() {
        Scanner scanner = new Scanner(in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        while (true) {

            try {
                validateRange(start, end);
                break;
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());

                start = scanner.nextInt();
                end = scanner.nextInt();
            }
        }
        for (int i = start; i <=end ; i++) {
            System.out.println(i);

        }
    }

    private static void validateRange(int start, int end) {
        if (start < 1 || start >= end || end > 100) {
            throw new IllegalArgumentException("Range must be between end: 1 < start < end < 100:"
                    + start+ " " + end+"\r\n"+"Please enter two new numbers in the range speciferd"+ "\r\n" );
        }
    }


}
