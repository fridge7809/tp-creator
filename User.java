import java.sql.Array;

public class User {
    int ftp = 0;
    // current training load metrics (todays date)
    int atl = 0;
    int ctl = 0;
    int tsb = 0;
    int[] tssArray = new int[6];
    int[] ctlArray = new int[41];

    public User(int FTP, int ATL, int CTL){
        this.ftp = FTP;
        this.atl = ATL;
        this.ctl = CTL;
        setTsb();
    }

    // get and set
    // https://www.trainerroad.com/blog/why-tss-atl-ctl-and-tsb-matter/

    public int getFtp() {
        return ftp;
    }
    public int getAtl() {
        return atl;
    }
    public int getCtl() {
        return ctl;
    }
    public int getTsb() {
        return tsb;
    }
    public void setFtp(int ftp) {
        this.ftp = ftp;
    }
    public void setAtl(int atl) {
        this.atl = atl;
    }
    public void setCtl(int ctl) {
        this.ctl = ctl;
    }
    public void setTsb() {
        this.tsb = this.ctl - this.atl;
    }

    public void executeWorkout(Run run){
		System.out.println("hello world i am running");
		setAtl(run.tss);
    }
}
