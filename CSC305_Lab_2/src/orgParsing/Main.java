package orgParsing;
import org.json.*;
import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        File f = new File("CSC305_Lab_2/input3.json");
        Scanner reader = new Scanner(f);
        StringBuilder sb = new StringBuilder();
        while (reader.hasNextLine()){
            sb.append(reader.nextLine());
        }
        reader.close();
        Person person = ExtractJSON.parseJSON(new JSONObject(sb.toString()));
        System.out.println(person);
    }
    
}
