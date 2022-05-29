import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите количество денег на счете.");
        double lastMoney = scanner.nextDouble();
        System.out.println("Укажите сумму пополнения счета." );
        double newMoney = scanner.nextDouble();
        int moneyBonus =0;
        if ((int) newMoney > 1000) {
            moneyBonus = (int) newMoney/100;};
        double newSchet;
        newSchet=lastMoney+newMoney+moneyBonus;
        System.out.println("Ваш итоговый счет "+ newSchet);
        System.out.println("Вам зачислено "+ moneyBonus+" бонусных рублей.");

    }
}
