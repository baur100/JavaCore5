package helper;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Arrays;

public class MongoAdapter {

    public static void callMongo() {
        System.setProperty("java.net.preferIPv4Stack" , "true");
        MongoClientURI uri = new MongoClientURI(
                "mongodb://new_user:Password%2D1@cluster0.6aqqp.mongodb.net/sample_airbnb");

        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("sample_airbnb");
        Document doc = new Document("name", "MongoDB")
                .append("type", "database")
                .append("count", 1)
                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
                .append("info", new Document("x", 203).append("y", 102));
        MongoCollection<Document> collection = database.getCollection("accounts");
        collection.insertOne(doc);



    }

}
