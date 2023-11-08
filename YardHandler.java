package Q1B;

public class YardHandler implements LengthConverter {
    @Override
    public double convert(double value) {
        // Implement the conversion logic from Kilometers to Yards
        return value * 1093.61;
    }
}
