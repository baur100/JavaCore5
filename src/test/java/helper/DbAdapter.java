package helper;

import models.Artist;
import models.Playlist;
import models.Song;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbAdapter {
    private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DB_URL = "jdbc:mariadb://104.237.9.33/dbkoel";
    private static final String USER = "dbuser06";
    private static final String PASS = "pa$$06";

    private static Connection connection = null;
    private static Statement statement = null;

    public static List<Artist> getArtists(){
        List<Artist> artists = new ArrayList<>();
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,USER,PASS);
            statement = connection.createStatement();

            String query = "SELECT * FROM artists a";
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                String image = result.getString("image");
                Artist artist = new Artist(id,name,image);
                artists.add(artist);
            }
        } catch (ClassNotFoundException err) {
            err.printStackTrace();
        } catch (SQLException err) {
            err.printStackTrace();
            System.out.println("Wrong credentials");
        } finally {
            if(connection!=null){
                try{
                    connection.close();
                } catch (SQLException err){
                    err.printStackTrace();
                }
            }
        }
        return artists;
    }

    public static List<Playlist> getAllPlaylists(){
        List<Playlist> playlists = new ArrayList<>();
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,USER,PASS);
            statement = connection.createStatement();

            String query = "SELECT id, name FROM playlists p where user_id = 37";
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                Playlist playlist = new Playlist(name,id);
                playlists.add(playlist);
            }
        } catch (ClassNotFoundException err) {
            err.printStackTrace();
        } catch (SQLException err) {
            err.printStackTrace();
            System.out.println("Wrong credentials");
        } finally {
            if(connection!=null){
                try{
                    connection.close();
                } catch (SQLException err){
                    err.printStackTrace();
                }
            }
        }
        return playlists;
    }

    public static Playlist getPlaylistById(int playlistId){
        Playlist playlist=null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,USER,PASS);
            statement = connection.createStatement();

            String query = "SELECT * FROM playlists p where id="+playlistId;
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                String name = result.getString("name");
                playlist = new Playlist(name, playlistId);
            }
        } catch (ClassNotFoundException err) {
            err.printStackTrace();
        } catch (SQLException err) {
            err.printStackTrace();
            System.out.println("Wrong credentials");
        } finally {
            if(connection!=null){
                try{
                    connection.close();
                } catch (SQLException err){
                    err.printStackTrace();
                }
            }
        }
        return playlist;
    }

    public static List<Song> getAllSongs(){
        List<Song> songs = new ArrayList<>();
        try{
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,USER,PASS);
            statement = connection.createStatement();

            String query = "select * from songs";
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                String id = result.getString("id");
                int album_id = result.getInt("album_id");
                int artist_id = result.getInt("artist_id");
                String title = result.getString("title");
                int disc = result.getInt("disc");
                int track = result.getInt("track");
                double length = result.getDouble("length");


                Song song = new Song(id,album_id,artist_id,title,disc,track,length);
                songs.add(song);

            }
        } catch (ClassNotFoundException | SQLException ignored){}
        finally {
            if(connection!=null){
                try{
                    connection.close();
                } catch (SQLException err){
                    err.printStackTrace();
                }
            }
        }
        return songs;
    }
}
