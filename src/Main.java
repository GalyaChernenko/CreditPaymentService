public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();

        int year;
        double result;

        int amount = 1_000_000;
        float percent = 9.99F;
        year = 1;

        result = service.calculate(amount, percent, year);
        System.out.println(result);


        amount = 1_000_000;
        year = 2;
        result = service.calculate(amount, percent, year);

        System.out.println(result);


        year = 3;
        result = service.calculate(amount, percent, year);

        System.out.println(result);

    }
}
