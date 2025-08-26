package kadai3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReturnedBook extends Book {
    /** 本の返却日 */
    private Calendar returnDate;
    public ReturnedBook(String title, String author, Calendar loanDate, Calendar returnDate, String price) {
        super(title, author, loanDate, price);
        this.returnDate = returnDate;
    }

    @Override
    public void displayBookInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(
            String.format("===========\nタイトル： %s\n著者： %s\n貸出日： %s\n返却日： %s\n価格： %s円\n状態： 返却済み\n===========",
                    this.title,
                    this.author,
                    dateFormat.format(this.loanDate.getTime()),
                    dateFormat.format(this.returnDate.getTime()),
                    this.price
            )
        );
    }
}
