package kadai3;

import java.util.Calendar;

public class ReturnedBook extends Book {
    /** 本の返却日 */
    private Calendar returnDate;
    public ReturnedBook(String title, String author, Calendar loanDate, Calendar returnDate, String price) {
        super(title, author, loanDate, price);
    }

}
