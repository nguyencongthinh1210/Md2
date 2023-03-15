package Ss04_Class_And_OOP.exercise.Class_quadraticequation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào hệ số a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào hệ số b: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào hệ số c: ");
        c = Integer.parseInt(scanner.nextLine());
        QuadraticEquation q = new QuadraticEquation(a,b,c);
        if (q.getDiscriminant(a,b,c)>=0){
            if (q.getRoot1(a,b,c)==q.getRoot2(a,b,c)){
                System.out.println("nghiệm của phương trình là");
                System.out.println(q.getRoot1(a,b,c));
            }
            else {
                System.out.println("nghiệm thứ 1 của phương trình là: ");
                System.out.println(q.getRoot1(a,b,c));
                System.out.println("nghiệm thứ 2 của phương trình là: ");
                System.out.println(q.getRoot2(a,b,c));
            }
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}
