package JacksonDatablindParsing;
import com.fasterxml.jackson.annotation.*;

class Reward {
    private final String name;
    private final int year;

    @JsonCreator
    Reward(@JsonProperty("name") String name, 
           @JsonProperty("year") int year){
        this.name = name;
        this.year = year;
    }

    public String toString(){
        return "" + name + ", " + year;
    }

}
