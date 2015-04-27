package com.cnova;

import java.util.Iterator;

import com.mongodb.DB;

import org.json.*;


public class TestClass {

	public static void main(String[] args) {
		Connection c = null;
		
		//String[] servers = {"mongo-pf004.dc.nova", "mongo-pf005.dc.nova", "mongo-pf006.dc.nova", "mongo-pf007.dc.nova"};
		//String[] servers = {"mongo-cb004.dc.nova", "mongo-cb005.dc.nova", "mongo-cb006.dc.nova", "mongo-cb007.dc.nova"};
		//String[] servers = {"mongo-b2b001.dc.nova", "mongo-b2b002.dc.nova", "mongo-b2b003.dc.nova"};
		//String[] servers = {"mongo-cdiscount001.dc.nova"};
		//String[] servers = {"mongo-nike001.dc.nova", "mongo-nike002.dc.nova", "mongo-nike003.dc.nova"};
		String[] servers = {"mongo-ex004.dc.nova"};

		
		//String server = "mongo-pf004.dc.nova";
		//String server = "mongo-pf005.dc.nova";
		//String server = "mongo-pf006.dc.nova";
		//String server = "mongo-pf007.dc.nova";
		
		//String server = "mongo-cdiscount001.dc.nova";
		//String server = "mongo-cdiscount002.dc.nova";
		//String server = "mongo-cdiscount003.dc.nova";
		
		for (String host : servers) {
			try{
				//usr_monitoria
				//CDISCOUNT - bwkU21mAP3vAZ20nAopQ
				//NIKE - zkH823Nal21ndPammwB4
				//OTHERS - 1qaz@WSX
				
				//c = new Connection(host, 27017, "usr_monitoria", "1qaz@WSX", "admin");
				c = new Connection(host, 27017, "usr_monitoria", "zkH823Nal21ndPammwB4", "admin");
				//c = new Connection(host, 27017, "usr_monitoria", "bwkU21mAP3vAZ20nAopQ", "admin");
				DB db = c.connectToAdminDB(); 
	
				JSONObject resultado = new JSONObject(db.command("serverStatus"));
				//JSONObject resultado = new JSONObject(db.);
				//serverStatus.globalLock.currentQueue.readers
				System.out.println(resultado);
				System.out.println(db.getStats());
				//Double bytesIn = resultado.getJSONObject("network").getDouble("bytesIn");
				//System.out.println(bytesIn);
				//System.out.println(bytesIn / (bytesIn + 10));
				
				
				
	
				
				/*
				JSONArray membros = resultado.getJSONArray("members");
				for (int i = 0; i < membros.length(); i++){
					System.out.println(membros.getJSONObject(i).getString("name"));
	
				}*/
				//System.out.println(resultado.getInt("fileSize"));
				
				//System.out.println(db.getCollection("$cmd.sys.inprog").findOne());
	
				
				//int query = resultado.getJSONObject("opcounters").getInt("command");
				//int previousInserts;
				
				//System.out.println("command: " + query);
				//System.out.println("availableConnections: " + availableConnections);
				//System.out.println("totalCreated: " + totalCreated);
				
				/*File yourFile = new File("query.txt");
				try{
					if(!yourFile.exists()) {
					    yourFile.createNewFile();
					} 
					BufferedReader leitura = new BufferedReader(new FileReader(yourFile));
					try {
						previousInserts = Integer.parseInt(leitura.readLine());
						System.out.println("Signed " + previousInserts);
						System.out.println("Unsigned " + (previousInserts & 0x00000000ffffffffL));
					} catch (Exception e) {
						previousInserts = 0;
						e.printStackTrace();
					}
					
					double actualInserts = query - previousInserts;
					System.out.println(query + " - " + previousInserts + " = " + actualInserts);
					leitura.close();
					
					FileOutputStream oFile = new FileOutputStream(yourFile, false); 
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(oFile));
					
					bw.write(String.valueOf(query));
	
					bw.close();
					
					
					
				}catch (Exception e){
					e.printStackTrace();
				}*/
				
				c.closeConnection();
				
			}catch(Exception e){
				c.closeConnection();
				e.printStackTrace();
				
			}finally{
				if (c != null){
					System.out.println("Fechando a conexão");
					c.closeConnection();
					c = null;
				}
			}
		}


	}

}
