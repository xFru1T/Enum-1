import java.time.DayOfWeek;
import java.time.LocalDate;
class Enum {
    public enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    public class Weekend {
        private Days dayOfWeek;
        public Days getDayOfWeek() {
            return dayOfWeek;
        }
        public void setDayOfWeek(Days dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
        }
    }
    public class res {
        private Weekend d;
        public void setD(Weekend d) {
            this.d = d;
        }
        public void wakeUp() {
            if (d.getDayOfWeek() == Days.SATURDAY || d.getDayOfWeek() == Days.SUNDAY) {
                System.out.println("Weekend");
            }
            else {
                System.out.println("Weekday");
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Enum ex = new Enum();
        Enum.Weekend weekend = ex.new Weekend();
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        Enum.Days day = Enum.Days.valueOf(dayOfWeek.name());
        weekend.setDayOfWeek(day);
        Enum.res ch = ex.new res();
        ch.setD(weekend);
        ch.wakeUp();
    }
}

