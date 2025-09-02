package kadai3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Kadai3 {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = fileRead("./src/kadai3/BookInfo.csv");
//            for (String s: list) {
//                System.out.println(s);
//            }
            ArrayList<Book> booklist = parseToBookList(list);

            for (Book book : booklist) {
                book.displayBookInfo();
            }




        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch (NullPointerException e) {
            System.out.println("以上です");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
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

    private static ArrayList<Book> parseToBookList(ArrayList<String> readLine) throws ParseException {

        ArrayList<Book>booklist = new ArrayList<>();
        for (String s: readLine) {
            String[] split = s.split(",",-1);

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
            Date loneDate = dateFormat.parse(split[2]);
            Calendar loneCalendar = Calendar.getInstance();
            loneCalendar.setTime(loneDate);

            if(split[3] == "") {
                booklist.add(new UnreturnedBook(split[0],split[1],loneCalendar,split[4]));
            }else {
                Date returnedDate = dateFormat.parse(split[3]);
                Calendar returnedCalendar = Calendar.getInstance();
                returnedCalendar.setTime(returnedDate);

                booklist.add(new ReturnedBook(split[0],split[1],loneCalendar,returnedCalendar,split[4]));
            }
        }
        return booklist;
    }
}