package ru.geekbrains.java_algoritms_tasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coord = new int[scanner.nextInt()];

        for (int i = 0; i < coord.length; i++) {
            coord[i] = scanner.nextInt();
        }
        System.out.print(result(coord));
    }

    public static int result(int[] coord) {
        int fromStart = 0;
        int fromEnd = 0;
        int sum = 100;
        int check = 0;
        int ich = 0;
        for (int i = coord.length - 1; i >= 0; i--) {
            fromStart = 0;
            fromEnd = 0;
            for (int j = coord.length - i - 1, k = i; j < coord.length; j++, k--) {
                fromStart += Math.abs(coord[j]);
                fromEnd += Math.abs(coord[k]);
                System.out.println(fromStart + " " + Math.abs(fromEnd));
                System.out.println();
                }
            if (sum > (fromStart + Math.abs(fromEnd))) {
                sum = (fromStart + Math.abs(fromEnd));
                check = coord[i];
                ich = i;
            }
            System.out.println("i now is: " + ich);
        }
        return check;
    }
}