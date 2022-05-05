public class BmiService {
    public double calculate(int bodyMass, double growth) {
        double heightInSquareMeters = growth * growth;
        double bodyMassIndex = bodyMass / heightInSquareMeters;
        return bodyMassIndex;
    }
}
