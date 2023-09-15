package ru.vsu.cs.naumov;

import java.util.Date;

public class Alert {
    public Date issueDate;

    public String bookName;

    public Date returnDate;

    public Integer fine;

    public Alert(Date issueDate, String bookName, Date returnDate, Integer fine) {
        this.issueDate = issueDate;
        this.bookName = bookName;
        this.returnDate = returnDate;
        this.fine = fine;
    }

    public void sendToLibrarian(Date issueDate, String bookName, Date returnDate) {
        System.out.println("Expired date:" + returnDate);
    };
}
