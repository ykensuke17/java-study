public class Book {
    /** 本のタイトル */
    private String title;
    /** 本の著者 */
    private String author;
    /** 本の貸出日 */
    private String loanDate;
    /** 本の返却日 */
    private String returnDate;
    /** 本の価格 */
    private String price;

    public Book(String title, String author, String loanDate, String returnDate, String price) {
        this.title = title;
        this.author = author;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() { return this.author; }

    public String getLoanDate() { return this.loanDate; }

    public String getReturnDate() { return this.returnDate; }

    public String getPrice() { return this.price; }

}