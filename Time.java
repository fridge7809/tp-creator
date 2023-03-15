import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Time {
    static LocalDate today = LocalDate.now();

    public Time(){
    }

    public LocalDate getCurrentDate(){
        return today;
    }

    public static long daysSinceDate(LocalDate date1){
        return ChronoUnit.DAYS.between(date1, today);
    }
}