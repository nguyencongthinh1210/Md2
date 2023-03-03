package Introduce_in_java.exercice;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double usd;
        double rate = 23000;
        double vnd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter USD: ");
        usd = scanner.nextDouble();
        vnd = usd*rate;
        System.out.println("gia tri VND la: "+vnd);
    }
}
