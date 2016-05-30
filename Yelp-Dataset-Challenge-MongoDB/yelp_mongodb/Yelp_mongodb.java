/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yelp_mongodb;

import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import com.mongodb.DB;

/**
 *
 * @author prath
 */
public class Yelp_mongodb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        MongoClient mongoClient= new MongoClient();
        DB db= mongoClient.getDB("yelp");
        try{
       List<String> databases = mongoClient.getDatabaseNames();
            int cntDb = databases.size();
            System.out.println("No of db:"+cntDb); 
            for (String dbName : databases) {
                System.out.println("- Database: " + dbName);
               
                                
                              }
        }
            catch(Exception e){
                }
        
            if(db.collectionExists("business")){
                DBCollection dbYelp = db.getCollection("business");
                long count = dbYelp.getCount();
                System.out.println("Number of businesses:"+count);
                /*List<org.bson.types.ObjectId> IDs = dbYelp.distinct("_id");
                Iterator<org.bson.types.ObjectId> itrStr = IDs.iterator();
                while(itrStr.hasNext()){
                    String currentID = itrStr.next().toString();
                    System.out.println("BusinessID:"+currentID);
                }*/
                List<com.mongodb.BasicDBObject> attr = dbYelp.distinct("attributes");
                Iterator<com.mongodb.BasicDBObject> itrAttr = attr.iterator();
                while(itrAttr.hasNext()){
                    String a = itrAttr.next().toString();
                    System.out.println("Attribute:"+a);
                }
                
                
            }


          }
    
}
