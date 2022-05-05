public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyMass = 110; // масса тела в кг.
        double growth = 1.82;  // Рост в метрах.
        double bodyMassIndex = service.calculate(bodyMass, growth);
        System.out.println("ИМТ: " + bodyMassIndex);
    }
}
