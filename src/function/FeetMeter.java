package function;

public class FeetMeter {
    public static void main(String[] args) {

    }

    public static double footToMeter(double foot) {
        double meter;
        meter = 0.305 * foot;
        return meter;
    }

    public static double meterToFoot(double meter) {
        double foot;
        foot = 3.279 * meter;
        return foot;
    }
}
