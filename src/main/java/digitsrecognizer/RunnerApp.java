package digitsrecognizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RunnerApp {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\badur\\Desktop\\SDA\\Programowanie II\\DigitsRecognitionApp",
                "trainingsample.csv");

        List<String> readAllLines;

        try{
            readAllLines = Files.readAllLines(path);
        }catch (IOException ex){
            throw new IOException("File not found");
        }

    }

}