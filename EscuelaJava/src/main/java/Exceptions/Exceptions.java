package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresar 2 enteros");
        try {
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("Error: divisor 0");
        } catch (InputMismatchException e) {
            System.out.println("Error: El input deben ser enteros");
        }
    }
}
