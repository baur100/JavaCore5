package dbTests;

import helper.MongoAdapter;
import org.testng.annotations.Test;

public class MongoTest {
    @Test
    public void runMongo(){
        MongoAdapter.callMongo();
    }
}
