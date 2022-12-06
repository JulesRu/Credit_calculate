public class CreditPaymentService {
    public double calculate(int months) {
        double credit = 1000000;
        double percent = 9.99;
        double rate = percent / (100 * 12);
        double underline = 1 + rate;
        double payment = credit * (rate / (1 - Math.pow(underline, -months)));
        return payment;
    }
}

