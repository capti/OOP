package ru.vsu.cs.naumov;

public class GeneralBook<T> extends Books {
    private T additionalInfo;

    public GeneralBook(String authorName, String bookName, Integer noOfBooks, T additionalInfo) {
        super(authorName, bookName, noOfBooks);
        this.additionalInfo = additionalInfo;
    }

    // Геттеры и сеттеры для поля additionalInfo

    public T getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(T additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


}
