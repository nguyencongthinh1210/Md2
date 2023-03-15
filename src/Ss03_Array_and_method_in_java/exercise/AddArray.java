package Ss03_Array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int input=0;
        int find;
        Scanner scanner = new Scanner(System.in);
        System.out.println("vui lòng nhập số phần tử của mảng: ");
        input = Integer.parseInt(scanner.nextLine());
        int[] newArray = new int[input];
        for (int i=0;i<newArray.length;i++){
            System.out.println("mời nhập phần tử thứ "+i+" của mảng: ");
            newArray[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println("mời nhập biến cần thêm :");
        find = Integer.parseInt(scanner.nextLine());
        int[] newArray2 = new int[newArray.length+1];
        for (int i=0; i<newArray2.length;i++){
            if (i==(newArray2.length-1)){
                newArray2[i] = find;
            }
            else {
                newArray2[i] = newArray[i];
            }
        }
        System.out.println("mảng sau khi thêm là: ");
        System.out.println(Arrays.toString(newArray2));
    }
}
