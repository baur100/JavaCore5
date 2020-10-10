package models_my;

public class Tag {
    private int id;
    private String name;

    public int getTag_id() {
        return id;
    }

    public Tag(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getTag_name() {
        return name;
    }
}
