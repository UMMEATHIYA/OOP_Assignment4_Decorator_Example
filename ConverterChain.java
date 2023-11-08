package Q1B;



public class ConverterChain {
    private FormattedConverter mileConverter;
    private FormattedConverter yardConverter;
    private FormattedConverter footConverter;

    public ConverterChain() {
        this.mileConverter = new UnitDecorator(new ExponentialDecorator(new RoundDecorator(new MileHandler())), "Miles");
        this.yardConverter = new UnitDecorator(new ExponentialDecorator(new RoundDecorator(new YardHandler())), "Yards");
        this.footConverter = new UnitDecorator(new ExponentialDecorator(new RoundDecorator(new FootHandler())), "Feet");
    }

    public FormattedConverter getMileConverter() {
        return mileConverter;
    }

    public FormattedConverter getYardConverter() {
        return yardConverter;
    }

    public FormattedConverter getFootConverter() {
        return footConverter;
    }
}
