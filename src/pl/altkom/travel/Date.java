package pl.altkom.travel;

import java.util.Objects;

public class Date {
    private static int counter = 0;

    private int year;
    private int month;
    private int day;

    public Date(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
        Date.counter = this.counter + 1;
    }

    public Date() {
        counter = counter + 1;
    }

    public void setDay(int d) {
        this.day = d;
    }

    static int countDates() {
        return counter;
    }

    public String toString() {
        return String.format("%d-%d-%d", year, month, day);
    }

    public Date clone() {
        return new Date(year, month, day);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date)) return false;
        Date date = (Date) o;
        return year == date.year &&
                month == date.month &&
                day == date.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
