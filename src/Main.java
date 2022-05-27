public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 80;
        double height = 1.81;
        double index = service.calculate(weight, height);
        System.out.println(index);
    }
}