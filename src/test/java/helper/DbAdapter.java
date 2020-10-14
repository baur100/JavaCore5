package helper;

import models.Artist;

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
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return artists;
    }

}
