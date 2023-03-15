package Ss02_Loop_in_java.exercise;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        run();
    }
    public static void menu(){
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
    }
    public static void rectangle(){
        int leght;
        int width;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter leght: ");
        leght = Integer.parseInt(scanner.nextLine());
        System.out.println("enter width: ");
        width = Integer.parseInt(scanner.nextLine());
        for (int i=0;i<=width;i++){
            for (int j=0;j<=leght;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        run();
    }
    public static void triangle(){
        int high;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter high: ");
        high = Integer.parseInt(scanner.nextLine());
        for (int i=1;i<=high;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i=1;i<=high;i++){
            for (int j=high-i+2;j<=high;j++){
                System.out.print("   ");
            }
            for (int h=1+i-1;h<=high;h++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i=1;i<=high;i++){
            for (int j=1;j<=high-i;j++){
                System.out.print("   ");
            }
            for (int h=high+1;h>high-i+1;h--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i=1;i<=high;i++){
            for (int j=1;j<=high-i+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        run();
    }
    public static void IsoscelesTriangle(){
        int high;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter high: ");
        high = Integer.parseInt(scanner.nextLine());
        for (int i=1;i<=high;i++) {
            for (int j = 1; j <= high - i; j++) {
                System.out.print("   ");
            }
            for (int h = 2 * high ; h > 2 * high - 2 * i + 1; h--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        run();
    }
    public static void run(){
        menu();
        Scanner scanner =new Scanner(System.in);
        int choose;
        System.out.println("enter your choose: ");
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                rectangle();
                break;
            case 2:
                triangle();
                break;
            case 3:
                IsoscelesTriangle();
                break;
            case 4:
                break;
        }
    }
}
