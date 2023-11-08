package Q1B;

public class YardHandler implements FormattedConverter {
    @Override
    public double convert(double value) {
        // Implement the conversion logic from Kilometers to Yards
        return value * 1093.61;
    }
    @Override
    public String format(double value) {
        return String.format("%.2f", value);
    }
}
