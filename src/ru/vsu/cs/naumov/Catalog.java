package ru.vsu.cs.naumov;

public class Catalog extends Books {
    private Integer noOfCopies;

    public Catalog(String authorName, String bookName, Integer noOfCopies) {
        super(authorName, bookName, noOfCopies);
        this.noOfCopies = noOfCopies;
    }

    // Геттеры и сеттеры для поля noOfCopies (по желанию)

    public Integer getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(Integer noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    // Метод для обновления информации о книге в каталоге
    public void updateInfo(String newAuthorName, Integer newNoOfCopies) {
        setAuthorName(newAuthorName);
        setNoOfCopies(newNoOfCopies);
    }

    // Метод для поиска книги в каталоге
    public boolean searchInCatalog(String bookName) {
        return getBookName().equals(bookName);
    }
}

