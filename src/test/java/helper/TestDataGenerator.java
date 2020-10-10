package helper;

import models.Category;
import models.PetRequest;
import models.Playlist;
import models.Tag;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class TestDataGenerator {
    public static String randomString(int length){
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
    public static PetRequest getPet(){
        Random rand = new Random();
        Category cat = new Category(rand.nextInt(100),randomString(9));
        String[]photoUrl = {randomString(10)};
        Tag tag = new Tag(rand.nextInt(50),randomString(8));
        Tag[] tags = {tag};
        return new PetRequest(cat,randomString(10),photoUrl,tags,randomString(5));
    }
    public static Playlist createPlaylistRequest(){
        return new Playlist(randomString(9));
    }
}
