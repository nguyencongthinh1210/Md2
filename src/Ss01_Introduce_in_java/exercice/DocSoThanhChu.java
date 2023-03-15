package Ss01_Introduce_in_java.exercice;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        checknum();
    }
    public static void checknum(){
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your num: ");
        num = Integer.parseInt(scanner.nextLine());
        int soHangTram = num/100;
        String soHangTramChu = "";
        int soHangChuc = (num-soHangTram*100)/10;
        String soHangChucChu = "";
        int soHangDonVi= num%10;
        String soHangDonViChu = "";
        if (num<0){
            System.out.println("enter again!");
            checknum();
        }
        else {
            if (num<1000){
                if (soHangTram==0&&soHangChuc==0&&soHangDonVi==0){
                    System.out.println("zero");
                }
                else {
                    switch (soHangTram){
                        case 0:
                            soHangTramChu = " ";
                            break;
                        case 1:
                            soHangTramChu = "one hundred";
                            break;
                        case 2:
                            soHangTramChu = "two hundred";
                            break;
                        case 3:
                            soHangTramChu = "three hundred";
                            break;
                        case 4:
                            soHangTramChu = "four hundred";
                            break;
                        case 5:
                            soHangTramChu = "five hundred";
                            break;
                        case 6:
                            soHangTramChu = "six hundred";
                            break;
                        case 7:
                            soHangTramChu = "seven hundred";
                            break;
                        case 8:
                            soHangTramChu = "eight hundred";
                            break;
                        case 9:
                            soHangTramChu = "nine hundred";
                            break;
                    }
                    if (soHangChuc==1){
                        soHangChucChu = " ";
                        switch (soHangDonVi){
                            case 0:
                                soHangDonViChu = "ten";
                                break;
                            case 1:
                                soHangDonViChu = "eleven";
                                break;
                            case 2:
                                soHangDonViChu = "twelfth";
                                break;
                            case 3:
                                soHangDonViChu = "thirteen";
                                break;
                            case 4:
                                soHangDonViChu = "fourteen";
                                break;
                            case 5:
                                soHangDonViChu = "fifteen";
                                break;
                            case 6:
                                soHangDonViChu = "sixteen";
                                break;
                            case 7:
                                soHangDonViChu = "seventeen";
                                break;
                            case 8:
                                soHangDonViChu = "eightteen";
                                break;
                            case 9:
                                soHangDonViChu = "nineteen";
                                break;
                        }
                    }
                    else {
                        switch (soHangChuc){
                            case 0:
                                soHangChucChu = " ";
                                break;
                            case 2:
                                soHangChucChu = " twenty";
                                break;
                            case 3:
                                soHangChucChu = " thirty";
                                break;
                            case 4:
                                soHangChucChu = " fourty";
                                break;
                            case 5:
                                soHangChucChu = " fifty";
                                break;
                            case 6:
                                soHangChucChu = " sixty";
                                break;
                            case 7:
                                soHangChucChu = " seventy";
                                break;
                            case 8:
                                soHangChucChu = " eightty";
                                break;
                            case 9:
                                soHangChucChu = " ninety";
                                break;
                        }
                        switch (soHangDonVi){
                            case 0:
                                soHangDonViChu = " ";
                                break;
                            case 1:
                                soHangDonViChu = " one";
                                break;
                            case 2:
                                soHangDonViChu = " two";
                                break;
                            case 3:
                                soHangDonViChu = " three";
                                break;
                            case 4:
                                soHangDonViChu = " four";
                                break;
                            case 5:
                                soHangDonViChu = " five";
                                break;
                            case 6:
                                soHangDonViChu = " six";
                                break;
                            case 7:
                                soHangDonViChu = " seven";
                                break;
                            case 8:
                                soHangDonViChu = " eight";
                                break;
                            case 9:
                                soHangDonViChu = " nine";
                                break;
                        }
                    }
                    System.out.println(soHangTramChu + soHangChucChu + soHangDonViChu);
                    checknum();
                }
            }
            else {
                System.out.println("enter again!");
                checknum();
            }
        }
    }
}
