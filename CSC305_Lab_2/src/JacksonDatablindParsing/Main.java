package JacksonDatablindParsing;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        
        ObjectMapper objMapper = new ObjectMapper();
        Person p = objMapper.readValue(new File("CSC305_Lab_2/input3.json"), Person.class);
        System.out.println(p);
    }
}
