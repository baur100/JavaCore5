package hw10;

import lesson10.Subjects;

public class FastFood {
    private String Name;
    private int DriveTime;
    private String Menu;
    private Colors color;
    //private Colors[] colors;

    public FastFood(String name, int driveTime, String menu, Colors color) {
        this.Name = name;
        this.DriveTime = driveTime;
        this.Menu = menu;
        this.color = color;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setDriveTime(int time) {
        this.DriveTime = time;
    }

    public int getDriveTime() {
        return DriveTime;
    }

    public void setMenu(String menu) {
        this.Menu=menu;
    }
    public String getMenu(){
        return Menu;
    }

    public void setColors(Colors colors){
        this.color = colors;
    }
    public Colors getColors(){
        return color;
    }

    public void printFastFood(){
        System.out.println("Do you want to eat cheat meal at " + Name + ", where Trade Mark in " +
                color + " color, and driving time is "+ DriveTime + " minutes. Menu is here: "+ Menu);
    }


}
