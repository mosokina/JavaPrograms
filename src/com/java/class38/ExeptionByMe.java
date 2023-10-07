package com.java.class38;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionByMe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (InputMismatchException e) {
            System.out.println("Please, fix InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("Please, fix ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please, fix ArrayIndexOutOfBoundsException");
        }
        System.out.println("The End");
    }
}
