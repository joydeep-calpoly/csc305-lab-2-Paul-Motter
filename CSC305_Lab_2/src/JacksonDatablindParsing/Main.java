
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
        reader.close();



        
        Person person = ExtractJSON.parseJSON();
        System.out.println(person);
    }
    
}
