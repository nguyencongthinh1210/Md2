package Ss03_Array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Add2Array {
    public static void main(String[] args) {
        int input=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("vui lòng nhập số phần tử của mảng 1 : ");
        input = Integer.parseInt(scanner.nextLine());
        int[] newArray = new int[input];
        for (int i=0;i<newArray.length;i++){
            System.out.println("mời nhập phần tử thứ "+i+" của mảng: ");
            newArray[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(newArray));
        int input2=0;
        System.out.println("vui lòng nhập số phần tử của mảng 2: ");
        input2 = Integer.parseInt(scanner.nextLine());
        int[] newArray2 = new int[input2];
        for (int i=0;i<newArray2.length;i++){
            System.out.println("mời nhập phần tử thứ "+i+" của mảng: ");
            newArray2[i] = Integer.parseInt(scanner.nextLine());
        }
        int[] newArray3 = new int[newArray.length+newArray2.length];
        for (int i=0; i<newArray.length;i++){
            newArray3[i] = newArray[i];
        }
        for (int i=0; i<newArray2.length;i++){
            newArray3[i+newArray.length] = newArray2[i];
        }
        System.out.println("mảng sau khi gộp là : ");
        System.out.println(Arrays.toString(newArray3));
    }
}
