package library;

public class Book {
    private int bookId;
    private String bookTitle;
    private String  auhorName;
    private int totalCopies;
    private int lendCopies;

    public Book(int bookId,String bookTitle, String auhorName, int totalCopies) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.auhorName = auhorName;
        this.totalCopies = totalCopies;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuhorName() {
        return auhorName;
    }

    public void setAuhorName(String auhorName) {
        this.auhorName = auhorName;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public boolean loanBook(){
        if(totalCopies <= 1)    return false;
            lendCopies++; totalCopies--;
            return true;
        }

     public boolean returnBook(){
        if(lendCopies==0) return false;
        lendCopies--;totalCopies++;
        return true;
     }

    public int getLendCopies() {
        return lendCopies;
    }

    public void setLendCopies(int lendCopies) {
        this.lendCopies = lendCopies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", auhorName='" + auhorName + '\'' +
                ", totalCopies=" + totalCopies +
                ", lendCopies=" + lendCopies +
                '}';
    }
}
