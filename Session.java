import java.time.LocalDate;
public class Session extends Run {
    public Session(int dur, double intens, int tss, LocalDate dateOfCompletion, boolean isCompleted){
		super(dur, intens, tss, dateOfCompletion, isCompleted);
    }
}
