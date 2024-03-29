package Ss02_Loop_in_java.exercise;

public class PrimeLessThan100 {
    public static void main(String[] args) {
        int count=0;
        for (int i=1;i<=100;i++){
            if (isPrimeNumber(i)==true){
                System.out.println("số nguyên tố thứ "+count + "là: " +i);
                count+=1;
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
