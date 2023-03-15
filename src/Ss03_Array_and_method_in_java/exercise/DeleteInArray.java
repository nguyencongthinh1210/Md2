package Ss03_Array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteInArray {
    public static void main(String[] args) {
        int input=0;
        int count=0;
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
        System.out.println("mời nhập biến cần tìm :");
        find = Integer.parseInt(scanner.nextLine());
        for (int i=0;i<newArray.length;i++){
            if (newArray[i]==find){
                count+=1;
            }
        }
        int[] newArray2 = new int[newArray.length-count];
        int count2=0;
        for (int i=0;i<newArray.length;i++){
            if (newArray[i]==find){
                count2+=1;
                break;
            }
            newArray2[i-count2] = newArray[i];
        }
        System.out.println("mảng sau khi xóa là: ");
        System.out.println(Arrays.toString(newArray2));
    }
}
