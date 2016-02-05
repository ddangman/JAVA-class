
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;
    private final int cd = Calendar.getInstance().get(Calendar.DATE);
    private final int cm = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
    private final int cy = Calendar.getInstance().get(Calendar.YEAR);

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name) {
        this.name = name;
        this.birthday = new MyDate(cd, cm, cy);
    }

    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        //cd: current day, cm: current month, cy: current year
        MyDate today = new MyDate(cd, cm, cy);

        return birthday.differenceInYears(today);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }

    public boolean olderThan(Person compared) {
        if (this.birthday.earlier(compared.birthday)) {
            return true;
        }
        return false;
    }
}
