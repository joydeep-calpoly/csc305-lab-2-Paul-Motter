package orgParsing;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

class ExtractJSON {

    static Person parseJSON(JSONObject json){
        //Parse Rewards from json.
        JSONArray rewardsJSON = json.getJSONArray("awards");
        ArrayList<Reward> rewards = new ArrayList<>();
        for(int i=0; i<rewardsJSON.length(); i++){
            rewards.add(new Reward((String)rewardsJSON.getJSONObject(i).get("name"), (int)rewardsJSON.getJSONObject(i).get("year")));
        }
        //Perse knownFor from json
        JSONArray knwonForJSON = json.getJSONArray("knownFor");
        ArrayList<String> knownFor = new ArrayList<>();
        for(int i=0; i<knwonForJSON.length(); i++){
            knownFor.add((String)knwonForJSON.get(i));
        }
        //create an return full person object.
        return new Person(rewards, knownFor, (String)json.get("name"));
    }
}
