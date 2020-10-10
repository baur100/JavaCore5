package models_my;

public class Category_my {
    private int id;
    private String name;

    public int getCategory_id() {
        return id;
    }

    public Category_my(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getCategory_name() {
        return name;
    }
}
