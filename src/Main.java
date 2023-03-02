public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int account = 1000;
        int deposit = 5000;
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int accountAfterDeposit = account + deposit + bonus;
        System.out.println("Итоговый счет: " + accountAfterDeposit);
        System.out.println("Количество бонусных рублей за пополнение: " + bonus);
    }
}