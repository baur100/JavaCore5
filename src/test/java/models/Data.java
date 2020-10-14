package models;

public class Data {
    private Album[] albums;
    public boolean allowDownload;
    private Artist[] artists;
    private String cdnUrl;
    private CurrentUser currentUser;
    private String currentVersion;
    private Interaction[] interactions;
    private String latestVersion;
    private Playlist[] playlists;
    private String[] recentlyPlayed;
    private Settings[] settings;
    private Song[] songs;
    private boolean supportsTranscoding;
    private boolean useLastfm;
    private boolean useYouTube;
    private boolean useiTunes;
    private User[] users;

    public Playlist[] getPlaylists() {
        return playlists;
    }
}
