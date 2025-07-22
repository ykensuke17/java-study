package kadai3;

import java.util.Calendar;

public class UnreturnedBook extends Book {
    /** 本の返却予定日 */
    private Calendar returnDate;
    public UnreturnedBook(String title, String author, Calendar loanDate, String price) {
        super(title, author, loanDate, price);
    }

    @Override
    public void displayBookInfo() {
        super.displayBookInfo();


    }
}
