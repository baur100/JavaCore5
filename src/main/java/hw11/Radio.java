package hw11;

import java.util.Arrays;

public class Radio extends Dashboard {
    private Stations[] stations;
    private String louder;
    private String quieter;

    public Radio(String on, String off, Stations[] stations, String louder, String quieter) {
        super(on, off);
        this.stations = stations;
        this.louder = louder;
        this.quieter = quieter;
    }

    public Stations[] getStations() {
        return stations;
    }

    public void setStations(Stations[] stations) {
        this.stations = stations;
    }

    public String getLouder() {
        return louder;
    }

    public void setLouder(String louder) {
        this.louder = louder;
    }

    public String getQuieter() {
        return quieter;
    }

    public void setQuieter(String quieter) {
        this.quieter = quieter;
    }

    public String toString() {
        return "Radio:" +
                "\nstations = " + Arrays.toString(stations) +
                "\n" + louder +
                "\n" + quieter +
                "\n" + on +
                "\n" + off;
    }
}