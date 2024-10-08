package JacksonDatablindParsing;
import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;

class Person {
    
    private final ArrayList<Reward> rewards;
    private final ArrayList<String> knownFor;
    private final String name;

    @JsonCreator
    private Person(@JsonProperty("awards") ArrayList<Reward> rewards, 
           @JsonProperty("knownFor") ArrayList<String> knownFor, 
           @JsonProperty("name") String name){
        this.rewards = rewards;
        this.knownFor = knownFor;
        this.name = name;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        //name & knownFor header
        sb.append(name);
        sb.append("\n\nKnown For:\n");
        //knownFor lines
        for(String line: knownFor){
            sb.append("\t");
            sb.append(line);
            sb.append("\n");
        }
        //Awards header
        sb.append("Awards:\n");
        //Award lines
        for(Reward reward: rewards){
            sb.append("\t");
            sb.append(reward);
            sb.append("\n");
        }
        
        return sb.toString();  
    }

}