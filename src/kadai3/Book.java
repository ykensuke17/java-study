package kadai3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public abstract class Book {
    /** 本のタイトル */
    protected String title;
    /** 本の著者 */
    protected String author;
    /** 本の貸出日 */
    protected Calendar loanDate;
    /** 本の価格 */
    protected String price;

    public Book(String title, String author, Calendar loanDate, String price) {
        this.title = title;
        this.author = author;
        this.loanDate = loanDate;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() { return this.author; }

    public Calendar getLoanDate() { return this.loanDate; }

    public String getPrice() { return this.price; }

//    public void displayBookInfo() {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//            System.out.println(
//                    String.format("===========\nタイトル： %s\n著者： %s\n貸出日： %s\n価格： %s円\n===========",
//                            this.title,
//                            this.author,
//                            dateFormat.format(this.loanDate.getTime()),
//                            this.price
//                    )
//            );
//    }

    abstract public void displayBookInfo();

}