package homework12;

import javax.swing.plaf.TableHeaderUI;

public class App {
    public static void main(String[] args) {
        Three_quarter_Inch_steel_pipe heater1 = new Gas_water_heater("Samsung", "tankless", 10000);
        ((Gas_water_heater) heater1).heatersInfo();
        heater1.thread_diameter();
        heater1.thread_length();
        System.out.println("--------------------");
        Three_quarter_Inch_steel_pipe heater2 = new Gas_water_heater("GE", "with tank", 20000 );
        ((Gas_water_heater)heater2).heatersInfo();
        heater2.thread_diameter();
        heater2.thread_length();
        System.out.println("--------------------");

        Three_quarter_Inch_steel_pipe radiator1 = new Cast_iron_section_radiator("AG", "China", 7);
        ((Cast_iron_section_radiator)radiator1).radiatorInfo();
        radiator1.thread_diameter();
        radiator1.thread_length();
        System.out.println("--------------------");

        Three_quarter_Inch_steel_pipe radiator2 =new Cast_iron_section_radiator("DC", "USA", 10);
        ((Cast_iron_section_radiator)radiator2).radiatorInfo();
        radiator2.thread_diameter();
        radiator2.thread_length();
        System.out.println("--------------------");
    }
}
