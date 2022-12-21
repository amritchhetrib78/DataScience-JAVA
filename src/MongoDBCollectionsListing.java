// MongoDB Java for Data Lake House Transformation
// Author:  Amrit Chhetri
// Purpose: Listing all collections
// MongoDB Database: https://www.mongodb.com/try/download/community

import com.mongodb.MongoClient;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;
/*
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
 */
public class MongoDBCollectionsListing {
    public static void main(String[] args) {
        try {
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            databases.forEach(db -> System.out.println(db.toJson()));

        } catch (Exception er) {
        }
    }
}

