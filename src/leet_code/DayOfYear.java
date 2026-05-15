package leet_code;

public class DayOfYear {

    public static int dayOfYear(String date) {

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            days[1] = 29;
        }

        int total = 0;

        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }

        total += day;

        return total;
    }

    public static void main(String[] args) {

        String date1 = "2019-01-09";
        System.out.println(dayOfYear(date1));

        String date2 = "2019-02-10";
        System.out.println(dayOfYear(date2));
    }
}