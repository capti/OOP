package ru.vsu.cs.naumov;

import java.util.Date;

public class Alert {
    private Date issuedDate;
    private String bookName;
    private Date returnDate;
    private Integer fine;

    public Alert(Date issuedDate, String bookName, Date returnDate, Integer fine) {
        this.issuedDate = issuedDate;
        this.bookName = bookName;
        this.returnDate = returnDate;
        this.fine = fine;
    }

    // Геттеры и сеттеры для полей (по желанию)

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getFine() {
        return fine;
    }

    public void setFine(Integer fine) {
        this.fine = fine;
    }
}
