package ru.vsu.cs.naumov;

public class Catalog extends Books{
    Books Authorname;

    public Integer noofCopies;

    public Catalog(String authorName, String authorname, Integer noOfBooks) {
        super(authorName, authorname, noOfBooks);
    }
}
