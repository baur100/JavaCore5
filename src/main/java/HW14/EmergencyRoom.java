package HW14;

public class EmergencyRoom extends Hospital {


       private int Capasity;


    public EmergencyRoom(String color, int floors, String location, String buisnessHours, int capasity) {
        super(color, floors, location, buisnessHours);
        Capasity = capasity;
    }

    public int getCapasity() {
        return Capasity;
    }

    public void setCapasity(int capasity) {
        Capasity = capasity;
    }


    @Override
    public String toString() {
        return "EmergencyRoom{" +
                "Capasity=" + Capasity +
                ", floors=" + floors +
                ", location='" + location + '\'' +
                '}';
    }
}
