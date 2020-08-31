package hw19;

import java.util.ArrayList;
import java.util.List;

public class AgriCultural {
    private String type;
    private String tools;

    public AgriCultural(String type, String tools) {
        this.type = type;
        this.tools = tools;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

   public void printInfoAgricultural(){
       System.out.println(type+"tools used "+ tools);
   }
}
