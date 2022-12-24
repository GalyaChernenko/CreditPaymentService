public class CalcService {
    public double calculate (int amount, float percent, int year) {

        int month = year * 12;
        float percentMonth = percent / (100 * month);
        double calkPow1 = 1 + percentMonth;
        double calkPow2 = Math.pow(calkPow1, month);
        double calkPow3 = 1 / calkPow2;
        double znam = 1 - calkPow3;

        double paymentLong = amount * percentMonth / znam;
        int payment = (int) paymentLong;

        return payment;


    }
}
