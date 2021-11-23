package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число меньше 15, которое нужно возвести в степень: ");
        int x = scan.nextInt();
        if (x>15) {
            System.out.println("Ошибка ввода. Повторите попытку") ;
            }
        System.out.print("Введите целое число меньше 15, в которое нужно возвести первое число: ");
        int n = scan.nextInt();
        if (n>15) {
            System.out.println("Ошибка ввода. Повторите попытку");
        }
        double res = 1;
        for (int i = 1; i <= n; i++) {
            res *= x;
        }
        System.out.println(x+"^"+n+"= "+q);
    }
}


