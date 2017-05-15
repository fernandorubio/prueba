package car.mongo;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;

public abstract class AconexionMongo {
	
	protected MongoClient mongoClient;
	protected MongoDatabase database;
	
	AconexionMongo(){
		
	}
	
	public void stop() {
    	mongoClient.close();
    }
	
	protected MongoCollection<Document> getCollection(String coleccion){
    	return  database.getCollection(coleccion);
    }
	
	protected void dropDatabase(String coleccion) {
		DeleteResult result = database.getCollection(coleccion).deleteMany(new Document());
		System.out.println("Borrados" + result.getDeletedCount());
	}
}
