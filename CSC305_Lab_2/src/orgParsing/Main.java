package orgParsing;
import org.json.*;
import java.io.*;
import java.util.Scanner;



class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("CSC305_Lab_2/input1.json");
        Scanner reader = new Scanner(f);
        StringBuilder sb = new StringBuilder();
        while (reader.hasNextLine()){
            sb.append(reader.nextLine());
        }
        System.out.println(sb.toString());
        JSONObject json = new JSONObject(sb.toString());
        for (json.getJSONArray("awards").toList().iterator(): json.getJSONArray("awards").toList().iterator()){

        }
        json.getJSONArray("awards").
        Person p = new Person(  json.getJSONArray("awards").toList(), json.getJSONArray("knownfor").toList(), json.get("name")));
        System.out.println(p);

        System.out.println(json.keySet());
        //System.out.println(json.getClass());

    }
    
}
