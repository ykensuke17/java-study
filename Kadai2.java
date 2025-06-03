import java.util.Arrays;
import java.io.*;
import java.nio.file.*;

public class Kadai2{
    public static void main(String[] args) {
        Path path = Paths.get("Bookindo.csv");
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}