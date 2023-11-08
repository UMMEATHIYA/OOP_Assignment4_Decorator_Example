package Q1B;

public class ExponentialDecorator implements FormattedConverter {
    private FormattedConverter converter;

    public ExponentialDecorator(FormattedConverter converter) {
        this.converter = converter;
    }

    @Override
    public double convert(double value) {
        return converter.convert(value);
    }

    @Override
    public String format(double value) {
        return String.format("%.4e", value);
    }
}
