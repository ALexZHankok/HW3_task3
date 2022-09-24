public class CreditPaymentService {
    public int calculate(int totalCredit, int years, double percentCredit) {

        double monthPercent = percentCredit / 100 / 12; // Месячная процентная ставка
        double numberMonths = years * 12; // Количество месяцев
        double monthPayment = totalCredit * monthPercent / (1 - Math.pow(1 + monthPercent, -numberMonths)); // Формула аннуентного платежа

        int result = (int) monthPayment;
        return result;
    }
}