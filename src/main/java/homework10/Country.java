package homework10;

import java.util.Arrays;

public class Country {
    private String full_name;
    private String abbreviation;
    private int population;
    private String political_system;
    private Resources[] main_resourсes;

    public String getFull_name() {
        return full_name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getPopulation() {
        return population;
    }

    public String getPolitical_system() {
        return political_system;
    }


    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setPolitical_system(String political_system) {
        this.political_system = political_system;
    }

    public void setMain_resources(Resources[] main_resourсes) {
        this.main_resourсes = main_resourсes;
    }

    public Resources[] getMain_resourсes() {
        return main_resourсes;
    }

    public void setMain_resourсes(Resources[] main_resourсes) {
        this.main_resourсes = main_resourсes;}
    

    public Country(String full_name, String abbreviation, int population, String political_system, Resources[] main_resourсes) {
        this.full_name = full_name;
        this.abbreviation = abbreviation;
        this.population = population;
        this.political_system = political_system;
        this.main_resourсes = main_resourсes;
    }

    public Country() {
    }

    public void countryInfo() {
        System.out.println("Country: " +
                "Name- " + full_name +
                ", Abbreviation- " + abbreviation +
                ", Population= " + population +
                ", Political system- " + political_system +
                ", Main resourсes- " + Arrays.toString(main_resourсes));

        }

}


