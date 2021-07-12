package day61_exceptions_collections.checked_exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        String filePath = "src/day61_exceptions_collections/checked_exceptions/data.txt";
        //Files.readAllLines(Paths.get(filePath)); --> storing into an arrayList
        List<String> data = Files.readAllLines(Paths.get(filePath));
        //declare by adding "throws IOException to method signature
        //can also "handle" by using try/catch

        for(String line : data){
            System.out.println(line);
        }
    }
}
