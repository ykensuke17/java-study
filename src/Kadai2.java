import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Kadai2 {
    public static void main(String[] args) {
        //        try (
//                BufferedReader br = new BufferedReader(
//                        new FileReader(
//                                "BookInfo.csv",
//                                Charset.forName("MS932")
//                        )
//                )
//        ) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] data = line.split(",");
//
//                for (String elem : data) {
//                    System.out.println("[" + elem + "]");
//                }
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    private static ArrayList<String> fileRead(String filePath) {
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
                String[] data = line.split(",");
                System.out.println(line);
            }
        }
    }
}