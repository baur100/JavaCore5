package dbTests;

import helper.DbAdapter;
import models.Artist;
import org.testng.annotations.Test;

import java.util.List;

public class GetArtists {
    @Test
    public void printArtists(){
        List<Artist> artists = DbAdapter.getArtists();
        for (Artist ar: artists) {
            System.out.println(ar);
        }

    }
}
