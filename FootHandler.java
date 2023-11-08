package Q1B;

public class FootHandler implements FormattedConverter {
    @Override
    public double convert(double value) {
        // Implement the conversion logic from Kilometers to Feet
        return value * 3280.84;
    }

    @Override
    public String format(double value) {
        return String.format("%.2f", value);
    }
}
