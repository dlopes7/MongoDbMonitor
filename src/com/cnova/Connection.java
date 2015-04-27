package com.cnova;

import java.net.UnknownHostException;
import java.util.Arrays;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;


public class Connection {
	
	private MongoClient mongoClient;
	private String user;
	private String pass;
	private String host;
	private String collection;
	private int port;
	private MongoCredential cred;
	
	public Connection(String host, int port, String user, String password, String collection) {
		this.user = user;
		this.pass = password;
		this.host = host;
		this.port = port;
		this.collection = collection;
		
		
		this.cred = MongoCredential.createCredential(
                this.user,
                this.collection,
                pass.toCharArray());
	}

    public DB connectToAdminDB() {
    	
        try {
        	mongoClient = new MongoClient( new ServerAddress(host, port), Arrays.asList(cred));
        	
        	//MongoClient mongoClient = new MongoClient(new ServerAddress(), Arrays.asList(credential));
        
        } catch (UnknownHostException e) {
            String msg = String.format("Unable to connect to mongodb; host=%s, port=%s",host , port);
            System.out.println(msg);
            throw new RuntimeException(msg, e);
        }

        DB db = mongoClient.getDB(cred.getSource());

        return db;
    } 
    public void closeConnection(){
    	if ( mongoClient != null){
    		mongoClient.close();
    	}
    }


}
