package ru.vsu.cs.naumov;

public class Books {
    private String authorName;
    private String bookName;
    private Integer noOfBooks;

    public Books(String authorName, String bookName, Integer noOfBooks) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.noOfBooks = noOfBooks;
    }

    // Геттеры и сеттеры для полей (по желанию)

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(Integer noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    // Метод для уменьшения количества доступных книг
    public void decrementNoOfBooks() {
        if (noOfBooks > 0) {
            noOfBooks--;
        }
    }

    // Метод для увеличения количества доступных книг
    public void incrementNoOfBooks() {
        noOfBooks++;
    }
}
