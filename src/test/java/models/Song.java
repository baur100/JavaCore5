package models;

public class Song {
    public String id;
    public int album_id;
    public int artist_id;
    public String title;
    public int disc;
    public int track;
    public double length;

    public Song(String id, int album_id, int artist_id, String title, int disc, int track, double length) {
        this.id = id;
        this.album_id = album_id;
        this.artist_id = artist_id;
        this.title = title;
        this.disc = disc;
        this.track = track;
        this.length = length;
    }

    public String getId() {
        return id;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public String getTitle() {
        return title;
    }

    public int getDisc() {
        return disc;
    }

    public int getTrack() {
        return track;
    }

    public double getLength() {
        return length;
    }
}
