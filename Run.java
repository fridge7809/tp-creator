import java.time.LocalDate;

public class Run {
    int duration;
    double intensity;
    int tss;
    Time timeModule = new Time();
    LocalDate dateOfExecution;
    boolean isExecuted;

	//constructor
    public Run(int dur, double intens, int TSS, LocalDate dateOfCompletion, boolean isCompleted){
        this.duration = dur;
        this.intensity = intens;
        this.tss = TSS;
        this.dateOfExecution = dateOfCompletion;
        this.isExecuted = isCompleted;
    }

	//get and set
    public int getDuration() {
        return duration;
    }
    public double getIntensity() {
        return intensity;
    }
    public int getTss() {
        return tss;
    }
    public LocalDate getDate() {
        return dateOfExecution;
    }
    public boolean getIsExecuted() {
        return isExecuted;
    }
    public void setExecuted(boolean isExecuted) {
        this.isExecuted = isExecuted;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setIntensity(double intensity) {
        this.intensity = intensity;
    }
    public void setTss(int tss) {
        this.tss = tss;
    }
        
}
