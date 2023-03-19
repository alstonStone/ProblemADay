package easy;

public class ConvertTheTemperature {

    public double[] convertTemperature(double celsius) {
        
        double[] converted = new double[2];

        converted[0] = celsius + 273.15;
        converted[1] = celsius * 1.80 + 32.00;

        return converted;

    }
}