package kadai3;

import java.util.ArrayList;
import java.util.Calendar;

public abstract class Book {
    /** 本のタイトル */
    private String title;
    /** 本の著者 */
    private String author;
    /** 本の貸出日 */
    private Calendar loanDate;
    /** 本の価格 */
    private String price;

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

    public void displayBookInfo() {
            System.out.println(
                    String.format("[%s][%s][%s][%s]",
                            this.title,
                            this.author,
                            this.loanDate,
                            this.price
                    )
            );
    }

}