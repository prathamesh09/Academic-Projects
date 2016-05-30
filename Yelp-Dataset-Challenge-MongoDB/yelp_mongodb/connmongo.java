/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yelp_mongodb;
import com.mongodb.AggregationOutput;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;
 
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import java.util.Iterator;
//import javax.swing.text.Document;
import com.mongodb.Block;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import com.mongodb.client.AggregateIterable;
import com.mongodb.util.JSON;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import org.bson.Document;

import static java.util.Arrays.asList;
import java.util.Collection;
import java.util.ListIterator;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 

/**
 *
 * @author prath
 */
public class connmongo
{
 
    public static void main(String[] args) {
      try {
            
            
            
            /* BasicDBObject select = new BasicDBObject();
                select.put("_id",0);
                select.put("business_id", 1);
                select.put("latitude", 1);
                select.put("longitude", 1);
                DBCursor locCursor = business.find(new BasicDBObject(), select);
                int row = locCursor.count();
                System.out.println("Rows:"+row);
                while(locCursor.hasNext()){
                    DBObject dbo = locCursor.next();
                    String bid = dbo.get("business_id").toString();

                    float lat = Float.parseFloat(dbo.get("latitude").toString());
                    float lon = Float.parseFloat(dbo.get("longitude").toString());
                    
                    float diffLat = Math.abs(latitude) - Math.abs(lat); 
                    float diffLon = Math.abs(longitude) - Math.abs(lon);
                    //System.out.println("Side1:"+diffLat);
                    //System.out.println("Side2:"+diffLon);
                    float latSide = diffLat * 55;
                    float lonSide = diffLon * 55;
                    
                    float sideSquare1 = latSide * latSide;
                    float sideSquare2 = lonSide * lonSide;
                    
                    double distance = Math.sqrt((sideSquare1 + sideSquare2));
                    
                    if(distance <= 5)
                        System.out.println("Business in radius of 20 miles:"+bid);
                }
            Set<String> collections = db.getCollectionNames();
            for (String colName : collections) {
                    System.out.println("\t + Collection:" + colName);
            }
            
            //db.business.aggregate( [{$match:{ $and: [{categories:"Restaurants"},{categories:"Grocery"}]}},{$group:{_id:{attributes:"$attributes"}}}])
                   
            addCategory("Restaurants");
            addCategory("Grocery");*/
            //DBCollection business = db.getCollection("business");
                 
                            
            
            //DBCollection business_location = db.getCollection("business_location");
            //business_location.save(new BasicDBObject("_id",new BasicDBObject("loc","-45,6")));
            
        //} catch(UnknownHostException ex) { ex.printStackTrace();
        } catch(NullPointerException npe){ npe.printStackTrace();
        } catch(Exception e){e.printStackTrace();}
    }
    
    

    
public static void importJSONFileToDBUsingJavaDriver(String pathToFile, DB db, String business1) {
    
    float latitude=0,longitude=0;
    // open file
    FileInputStream fstream = null;
    try {
        fstream = new FileInputStream ("C:\\User\\prath\\Download\\PRATHAMESH_HW2\\PRATHAMESH_HW2\\YelpDataset\\YelpDataset-CptS451\\yelp_business.json");
    } catch (FileNotFoundException e) {
        e.printStackTrace();
        System.out.println("file not exist, exiting");
        return;
    }
    BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

    // read it line by line
    String strLine;
    DBCollection newColl =   db.getCollection(business1);
    try {
        while ((strLine = br.readLine()) != null) {
            // convert line by line to BSON
//            DBObject bson = (DBObject) JSON.parse(JSONstr);
            // insert BSONs to database
            try {
                //newColl.insert(bson);
            }
            catch (MongoException e) {
              // duplicate key
              e.printStackTrace();
            }
BasicDBList geoCoord = new BasicDBList();
    geoCoord.add(longitude);
    geoCoord.add(latitude);

    BasicDBList geoParams = new BasicDBList();
    geoParams.add(geoCoord);
    geoParams.add(10);

  //  BasicDBObject query = new BasicDBObject("loc", 
        //new BasicDBObject("$geoWithin", 
            //new BasicObject("$center", geoParams)
//        )
    //);
            

        }
        br.close();
    } catch (IOException e) {
        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
    }


}
}