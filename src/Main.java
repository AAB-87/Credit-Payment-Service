public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000;
        int loanRepaymentPeriod = 36; // в месяцах
        double interestRate = 9.99;
        double monthlyPayment = service.calculate(loanAmount, loanRepaymentPeriod, interestRate);
        System.out.printf("%.0f", monthlyPayment);
    }
}
