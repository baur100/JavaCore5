package helpers_my;

import models_my.Category_my;
import models_my.PetRequest_my;
import models_my.PlaylistKoel;
import models_my.Tag;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class TestDataGenerator_my {
    public static String randomString(int length) {
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);

    }

    public static PetRequest_my postRandomPet() {
        Random rand = new Random();
        Category_my cat = new Category_my(rand.nextInt(100), randomString(10));
        String[] photoUrl = {randomString(12)};
        Tag tag = new Tag(rand.nextInt(50), randomString(8));
        Tag[] tags = {tag};
        return new PetRequest_my(cat, randomString(11), photoUrl, tags, randomString(5));
    }

    public static PlaylistKoel createPlaylistRequest() {
        return new PlaylistKoel(randomString(9));
    }

    public static PlaylistKoel renamePlaylistRequest() {
        return new PlaylistKoel(randomString(10));
    }
}
