package pl.altkom.travel;

public class Date {
    public static int counter = 0;

    public int year;
    public int month;
    public int day;

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

    public String getInfo() {
        return String.format("%d-%d-%d", year, month, day);
    }

    public Date clone() {
        return new Date(year, month, day);
    }
}
