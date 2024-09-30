import java.util.Enumeration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        float Summa = scanner.nextInt();
        System.out.println("Введите срок вклада в меясцах");
        int Month = scanner.nextInt();
        for (int i = 1; i <= Month; i++) {
            Summa += Summa * 0.07;
        }
        System.out.printf("После %d месяцев сумма вклада составит %f рублей", Month, Summa);
    }
}