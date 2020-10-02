package function;

public class AreaTriangle {
    public static void main(String[] args) {
        System.out.printf("%.2f", areaTriangle(3.6, 7.1, 5.5));
    }

    public static boolean isTriangle(double side1, double side2, double side3) {
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            return true;
        } else return false;
    }

    public static double areaTriangle(double side1, double side2, double side3) {
        double halfCircumference, area;
        if (!isTriangle(side1, side2, side3))
            return 0;
        else {
            halfCircumference = (side1 + side2 + side3) / 2;
            area = Math.sqrt(halfCircumference * (halfCircumference - side1)
                    * (halfCircumference - side2) * (halfCircumference - side3));
            return area;
        }
    }
}
