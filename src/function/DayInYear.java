package function;

public class DayInYear {
    public static void main(String[] args) {
        for (int i = 2000; i <= 2020; i++) {
            System.out.println(i + " : " + numberOfDaysInAYear(i));
        }
    }

    public static int numberOfDaysInAYear(int year) {
        if (leapYear(year))
            return 366;
        else return 365;
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else return false;
            } else return true;
        } else return false;
    }
}
