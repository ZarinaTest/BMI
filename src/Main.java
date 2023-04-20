
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 60;
        double height = 1.72;
        double bmi = service.calculate(weight, height);

        System.out.println("Ваш индекс массы тела составляет: " + bmi);
    }
}