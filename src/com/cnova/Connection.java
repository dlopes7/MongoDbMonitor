package com.cnova;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;


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
        	mongoClient = new MongoClient(host, port);
        
        } catch (UnknownHostException e) {
            String msg = String.format("Unable to connect to mongodb; host=%s, port=%s",host , port);
            System.out.println(msg);
            throw new RuntimeException(msg, e);
        }

        DB db = mongoClient.getDB(cred.getSource());
        
        boolean authenticated = db.authenticate(cred.getUserName(), cred.getPassword());
        
        if(!authenticated) {
        	String msg = String.format("Unable to authenticate with the db %s, user=%s, using password ****",
                    cred.getSource(), cred.getUserName());
        	System.out.println(msg);
            throw new RuntimeException(msg);
        }
        return db;
    } 
    public void closeConnection(){
    	if ( mongoClient != null){
    		mongoClient.close();
    	}
    }


}
