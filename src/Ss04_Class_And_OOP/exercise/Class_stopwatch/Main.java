package Ss04_Class_And_OOP.exercise.Class_stopwatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch st = new StopWatch();
        System.out.println("thiết lập time start: ");
        st.StartTime(Double.parseDouble(scanner.nextLine()));
        System.out.println("thiết lập time stop: ");
        st.stop(Double.parseDouble(scanner.nextLine()));
        System.out.println("thời gian trôi qua là: ");
        System.out.println(st.getElapsedTime());
    }
}
