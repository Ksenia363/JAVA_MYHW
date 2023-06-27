// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class FirstTask {
    int n;

    public FirstTask() {
        System.out.println("Введите число");
    }

    public void intOutput() {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        input.close();
    }
    public void result (int n) {
        int result1 = 0;
        int result2 = 1;
        for (int i = 1; i <= n; i++) {
            result1 +=i;
            result2 *=i;
        }
        System.out.println("Cумма чисел от 1 до n: " + result1 + " Факториал от числа n: " + result2 );

    }
}