package Q1B;

public class RoundDecorator implements FormattedConverter {
    private FormattedConverter converter;

    public RoundDecorator(FormattedConverter converter) {
        this.converter = converter;
    }

    @Override
    public double convert(double value) {
        return converter.convert(value);
    }

    @Override
    public String format(double value) {
        return String.format("%.2f", value);
    }
}
