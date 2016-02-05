
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        //decide greater date
        MyDate greater = comparedDate;
        MyDate lesser = this;
        if (comparedDate.earlier(this)) {
            greater = this;
            lesser = comparedDate;
        }
        int yearCount = greater.year - lesser.year - 1;

        if (greater.month * 30 + greater.day >= lesser.month * 30 + lesser.day) {
            yearCount++;
        }
        if (yearCount < 0) {
            yearCount = 0;
        }
        return yearCount;

    }

}
