package Q1B;

public class MileHandler implements FormattedConverter {
    @Override
    public double convert(double value) {
        // Implement the conversion logic from Kilometers to Miles
        return value * 0.621371;
    }

    @Override
    public String format(double value) {
        return String.format("%.2f", value);
    }
}

