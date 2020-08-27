package hw11;

public class Dashboard {
    protected String on;
    protected String off;

    public Dashboard(String on, String off) {
        this.on = on;
        this.off = off;
    }

    public String getOn() {
        return on;
    }

    public void setOn(String on) {
        this.on = on;
    }

    public String getOff() {
        return off;
    }

    public void setOff(String off) {
        this.off = off;
    }

    public String toString() {
        return "\nDashboard: " +
                "\n" + on +
                "\n" + off;
    }
}
