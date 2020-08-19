package HW14;

public class Hospital extends House {

    private  String buisnessHours;


    public Hospital(String color, int floors, String location, String buisnessHours) {
        super(color, floors, location);
        this.buisnessHours = buisnessHours;
    }


    public String getBuisnessHours() {
        return buisnessHours;
    }


    public void setBuisnessHours(String buisnessHours) {
        this.buisnessHours = buisnessHours;
    }


    @Override
    public String toString() {
        return "Hospital{" +
                "buisnessHours='" + buisnessHours + '\'' +
                ", floors=" + floors +
                ", location='" + location + '\'' +
                '}';
    }
}

