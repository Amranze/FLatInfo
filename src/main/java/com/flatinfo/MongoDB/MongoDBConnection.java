package com.flatinfo.MongoDB;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoDBConnection {
	
	@SuppressWarnings("deprecation")
	public DBCollection MongoDBConnection() {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("flat");
		DBCollection userCollection = db.getCollection("userDB");
		return userCollection;
	}

}
