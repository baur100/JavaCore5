package hw11;

public class Home {
    public static void main(String[] args) {

        Stations[] stations = {Stations.SiriusXM};
        Dashboard dash = new Dashboard("Turn ON navigation", "Turn OFF navigation");
        Car kia = new Car("Hello, please, start your car", "Please, turn off your car...Bye!", "Kia", "Optima", 2016, "White", "Welcome to your Kia!");
        Climate clim = new Climate("Turn ON the climate system", "Turn OFF the climate system", "Temperature raised", "Temperature lowered");
        Radio rad = new Radio("Turn ON the radio", "Turn OFF the radio", stations, "...sound lowered", "...sound increase");


        System.out.println(kia.getStartEngine());
        System.out.println(kia.on);
        System.out.println(dash.getOn());
        System.out.println(clim.on);
        System.out.println(rad.on + " " + Stations.SiriusXM);
        System.out.println(rad.getQuieter());
        System.out.println(clim.off);
        System.out.println(rad.getLouder());
        System.out.println(dash.getOff());
        System.out.println(kia.getOff());


    }
}
