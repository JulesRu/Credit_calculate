public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        // комментарий по округлению:
        // округлила значения с помощью найденного в сети способа Math.round, корректно ли так делать?

        System.out.println();
        System.out.println("Кредит 1000000 на 1 год со ставкой 9.99%, ежемесячный платеж:");
        double a = service.calculate(12);
        System.out.println(Math.round(a) + " рублей");

        System.out.println();
        System.out.println("Кредит 1000000 на 2 года со ставкой 9.99%, ежемесячный платеж:");
        double b = service.calculate(24);
        System.out.println(Math.round(b) + " рублей");

        System.out.println();
        System.out.println("Кредит 1000000 на 3 года со ставкой 9.99%, ежемесячный платеж:");
        double c = service.calculate(36);
        System.out.println(Math.round(c) + " рублей");
    }
}