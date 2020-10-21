package models;

public class Playlist {
    private String name;
    private int id;

    public Playlist(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Playlist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
