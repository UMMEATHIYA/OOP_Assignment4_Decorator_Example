package Q1B;

public class Client {
    private ConverterChain converterChain;

    public Client() {
        this.converterChain = new ConverterChain();
    }

    public String convert(String unit, double value) {
        try {
            FormattedConverter converter;

            switch (unit) {
                case "Mile":
                    converter = converterChain.getMileConverter();
                    break;
                case "Yard":
                    converter = converterChain.getYardConverter();
                    break;
                case "Foot":
                    converter = converterChain.getFootConverter();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid unit specified.");
            }

            double convertedValue = converter.convert(value);
            return converter.format(convertedValue);
        } catch (IllegalArgumentException e) {
            return "Invalid unit selected.";
        }
    }
}
