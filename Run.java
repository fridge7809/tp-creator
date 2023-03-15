import java.time.LocalDate;

public class Run {
    int duration;
    double intensity;
    int tss;
    Time timeModule = new Time();
    LocalDate dateOfExecution;
    private boolean isExecuted;
    String runType;

	//constructor
    public Run(int TSS, String type){
        this.tss = TSS;
        createRun(TSS, type);
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

    // methods
    public void executeRun(){
        this.isExecuted = true;
        this.dateOfExecution = timeModule.getCurrentDate();
        return;
    }
    private void createRun(int tss, String type){
        this.duration = 0;
        this.intensity = 0;
        return;
    }        
}
