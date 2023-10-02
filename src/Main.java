public class Main {
    public static void main(String[] args) {

        int balance = 100; // баланс счёта;
        int refill = 1100; // сумма пополнения;

        int bonus; // бонус за пополнение счёта;
        if (refill > 1000) {
            bonus = refill / 100;
        } else
            bonus = 0;
        System.out.println("Бонус = " + bonus);
        System.out.println("Баланс счёта = " + (bonus +refill + balance));
    }
}
