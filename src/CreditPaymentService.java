public class CreditPaymentService {
    public int calculate(int loanAmount, int loanRepaymentPeriod, double interestRate) {
        double interestPerMonth = interestRate / 12;
        double annuityRatio = (((interestPerMonth / 100 * (Math.pow((1 + interestPerMonth / 100), loanRepaymentPeriod))) / (Math.pow((1 + interestPerMonth / 100), loanRepaymentPeriod) - 1)));
        int monthlyPayment = (int) (loanAmount * annuityRatio);
        return monthlyPayment;
    }
}

