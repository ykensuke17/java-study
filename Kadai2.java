import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Path;

public class Kadai2 {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(
                        new FileReader(
                                "BookInfo.csv",
                                Charset.forName("MS932")
                        )
                )
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}