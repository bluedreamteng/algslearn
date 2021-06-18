package chapter1.section2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exerise11 {
    public static void main(String[] args) {
        SmartDate smartDate1 = new SmartDate(4, 18, 1989);
        SmartDate invalidDate = new SmartDate(2, 30, 2016);
    }
}

class SmartDate{
    private final int year;
    private final int month;
    private final int day;

    public SmartDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

        if(!isDateValid(month,day,year)) {
            throw new RuntimeException("date valid");
        }

    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }


    private boolean isDateValid(int month, int day, int year) {

        boolean valid = true;

        int[] maxNumberOfDaysPerMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (year < 1 || month < 1 || month > 12 || day < 1 || day > maxNumberOfDaysPerMonth[month-1]) {
            valid = false;
        }

        return valid;
    }

    public String dayOfTheWeek() {
        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        Calendar calendar = Calendar.getInstance();
        Date date;

        try {
            date = new SimpleDateFormat("MM/dd/yyyy").parse(this.toString());
            calendar.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return days[dayOfWeek - 1];
    }

    @Override
    public String toString() {
        return month() + "/" + day() + "/" + year();
    }
}
