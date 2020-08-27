package hw11;

public class Climate extends Dashboard {
    private String raiseTemp;
    private String lowTemp;

    public Climate(String on, String off, String raiseTemp, String lowTemp) {
        super(on, off);
        this.raiseTemp = raiseTemp;
        this.lowTemp = lowTemp;

    }

    public String getRaiseTemp() {
        return raiseTemp;
    }

    public void setRaiseTemp(String raiseTemp) {
        this.raiseTemp = raiseTemp;
    }

    public String getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(String lowTemp) {
        this.lowTemp = lowTemp;
    }

    public String toString() {
        return "Climate: " +
                "\n" + raiseTemp +
                "\n" + lowTemp +
                "\n" + on +
                "\n" + off;
    }
}


