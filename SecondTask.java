// Вывести все простые числа от 1 до 1000
public class SecondTask {
    int n = 1000;

    public void result2(int n) {
        for (int i = 2; i < n; i++) {
            int count = 0;
            for (int j = 2; j <= i && count < 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count < 2)
                System.out.println(i);
        }
    }
}