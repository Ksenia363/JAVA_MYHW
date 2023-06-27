// Реализовать простой калькулятор

import java.util.Scanner;

public class ThirdTask {

    int x;
    int y;
    char z;

    public ThirdTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        x = in.nextInt();
        System.out.println("Введите второе число");
        y = in.nextInt();
        System.out.println("Введите символ операции для двух чисел '+' или  '-' или  '/' или '*'");
        z =in.next().charAt(0);
        in.close();
    }

    public static void calculator (int x, int y, char z) {
        if (z == '+') {
            System.out.println(x + y);
        } else if (z == '-') {
            System.out.println(x - y);

        } else if (z == '*') {
            System.out.println(x * y);

        } else if (z == '/') {
            System.out.println(x / y);
        }
    }
}











