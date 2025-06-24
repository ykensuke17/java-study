import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Kadai2 {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = fileRead("BookInfo.csv");
            for (String s: list) {
                System.out.println(s);
            }
            ArrayList<Book> booklist = parseToBookList(list);






        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch (NullPointerException e) {
            System.out.println("以上です");
        }
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

    private static ArrayList<String> fileRead(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(
                        filePath,
                        Charset.forName("MS932")
                )
        );

        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            list.add(line);
        }
        return list;
    }

    private static ArrayList<Book> parseToBookList(ArrayList<String> readLine){




        return null;
    }

    private static void displyBookInfo(ArrayList<Book> bookList){







        return;
    }
}