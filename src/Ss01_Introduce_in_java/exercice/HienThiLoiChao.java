package Ss01_Introduce_in_java.exercice;

import java.util.Scanner;
public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("enter your name: ");
        name = scanner.nextLine();
        System.out.println("hello " +name);
    }
}
