package kadai3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UnreturnedBook extends Book {
    private final Calendar scheduledReturnDate;
    /** 本の返却予定日 */
    public UnreturnedBook(String title, String author, Calendar loanDate, String price) {
        super(title, author, loanDate, price);
        this.scheduledReturnDate = Calendar.getInstance();
        Date dloanDate = loanDate.getTime();
        scheduledReturnDate.setTime(dloanDate);
        scheduledReturnDate.add(Calendar.DAY_OF_MONTH, 30);
        System.out.println(this.loanDate);
        System.out.println(this.scheduledReturnDate);
    }

    @Override
    public void displayBookInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(
                String.format("===========\nタイトル： %s\n著者： %s\n貸出日： %s\n返却日予定日： %s\n価格： %s円\n状態： 未返却\n===========",
                        this.title,
                        this.author,
                        dateFormat.format(this.loanDate.getTime()),
                        dateFormat.format(this.scheduledReturnDate.getTime()),
                        this.price
                )
        );
    }
/** ↓追加課題途中 */
//    public void extension(int num){
//        super(title, author, loanDate, price);
//
//    }


}
