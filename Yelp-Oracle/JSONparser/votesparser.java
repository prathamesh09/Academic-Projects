/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSONparser;
import Model.votes;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
/**
 *
 * @author prath
 */
public class votesparser {
     public static void main(String x[]){
    String FileName="C:\\Users\\prath\\Downloads\\PRATHAMESH_HW2\\PRATHAMESH_HW2\\YelpDataset\\YelpDataset-CptS451\\yelp_review.json";
    try {
        List<votes> jsons=ReadJSON(new File(FileName),"UTF-8");
    } catch (FileNotFoundException | ParseException e) {
    }
}
    public static synchronized List<votes> ReadJSON(File MyFile,String Encoding) throws FileNotFoundException, ParseException {
    Scanner scn=new Scanner(MyFile,Encoding);
    ArrayList<JSONObject> json=new ArrayList<>();
//Reading and Parsing Strings to Json
    while(scn.hasNext()){
        JSONObject obj= (JSONObject) new JSONParser().parse(scn.nextLine());
        json.add(obj);
    }

    
  
    List<votes> vList = new ArrayList<>();
    
    for(JSONObject obj : json){
        votes temp = new votes();
       
       // JSONObject obj = null;
        
        if(obj.containsKey("review_id"))
        {
            String rid = obj.get("review_id").toString();
            temp.setReview_id(rid); 
            System.out.println("ReviewID:"+obj.get("review_id"));
        }
                 
                if(obj.containsKey("funny"))
        {
            int fun = Integer.parseInt(obj.get("funny").toString());
            temp.setFunny(fun);
            System.out.println("FUnny:"+obj.get("funny"));
        }
                if(obj.containsKey("useful"))
        {
          int use = Integer.parseInt(obj.get("useful").toString());
            temp.setUseful(use);
            System.out.println("Stars:"+obj.get("stars"));
        }
                if(obj.containsKey("cool"))
                {
                    int cl = Integer.parseInt(obj.get("cool").toString());
                    temp.setCool(cl);
                    System.out.println("Cool:"+obj.get("cool"));
                }
        vList.add(temp);
    }
    return vList;
}

    public static List<votes> ReadJSON(String utF8) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

