package Q1B;

public class UnitDecorator implements FormattedConverter {
    private FormattedConverter converter;
    private String unit;

    public UnitDecorator(FormattedConverter converter, String unit) {
        this.converter = converter;
        this.unit = unit;
    }

    @Override
    public double convert(double value) {
        return converter.convert(value);
    }

    @Override
    public String format(double value) {
        return converter.format(value) + " " + unit;
    }
}