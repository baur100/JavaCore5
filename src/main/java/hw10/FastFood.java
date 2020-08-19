package hw10;

import java.util.Arrays;

public class FastFood {
    private String name;
    private int driveTime;
    private String menu;
    //private Colors color;
    private Colors[] colors;

    public FastFood(String name, int driveTime, String menu, Colors[] colors) {
        this.name = name;
        this.driveTime = driveTime;
        this.menu = menu;
        this.colors = colors;
    }

    public FastFood(){}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDriveTime(int time) {
        this.driveTime = time;
    }

    public int getDriveTime() {
        return driveTime;
    }

    public void setMenu(String menu) {
        this.menu =menu;
    }
    public String getMenu(){
        return menu;
    }

    public void setColors(Colors[] colors){
        this.colors = colors;
    }
    public Colors[] getColors(){
        return colors;
    }
    public String printColorsArray(){
        return Arrays.toString(colors);
    }

    public void printFastFood(){
        System.out.println("Do you want to eat cheat meal at " + name + ", where Trade Mark in " +
                printColorsArray() + " color, and driving time is "+ driveTime + " minutes. Menu is here: "+ menu);
    }


}
