// MongoDB Java for Data Lake House Transformation
// Author:  Amrit Chhetri
// Purpose: Creating New Collection
// MongoDB Database: https://www.mongodb.com/try/download/community
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
public class MongoDBCreatingCollection {
    public static void main( String args[] ) {
        /*
        MongoCredential credential;
        credential = MongoCredential.createCredential("sampleUser", "IOTDB",
                "password".toCharArray());
        System.out.println(credential.getUserName());
         */
        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        System.out.println("Connected to MongoDB Database successfully!");
        MongoDatabase mongoDBInstance = mongoClient.getDatabase("IOTDB");
        mongoDBInstance.createCollection("IOTSampleCollection1");
        // Inserting into collection
        System.out.println("Collection created!");
    }
} 