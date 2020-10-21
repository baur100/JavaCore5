package dbTests;

import helper.DbAdapter;
import models.Artist;
import models.Playlist;
import models.Song;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GetArtists {
    @Test
    public void printArtists(){
        List<Artist> artists = DbAdapter.getArtists();
        Assert.assertEquals(artists.size(),52);
        Assert.assertEquals(artists.get(6).name,"Ketsa");
    }
    @Test
    public void printPlaylists(){
        List<Playlist> pls = DbAdapter.getAllPlaylists();
        Assert.assertEquals(pls.size(),4);
    }
    @Test
    public void getPlaylistById(){
        Playlist pl = DbAdapter.getPlaylistById(1308);
        Assert.assertEquals(pl.getName(),"YYY");
    }
    @Test
    public void getAllSongs(){
        List<Song> songs = DbAdapter.getAllSongs();
        songs.forEach(x-> System.out.println(x.title));

    }
}
