package ru.vsu.cs.naumov;

public class ReferenceBook<T> extends Books {
    private T referenceInfo;

    public ReferenceBook(String authorName, String bookName, Integer noOfBooks, T referenceInfo) {
        super(authorName, bookName, noOfBooks);
        this.referenceInfo = referenceInfo;
    }

    // Геттеры и сеттеры для поля referenceInfo (по желанию)

    public T getReferenceInfo() {
        return referenceInfo;
    }

    public void setReferenceInfo(T referenceInfo) {
        this.referenceInfo = referenceInfo;
    }

    // Дополнительные методы для работы с информацией о справочной книге (по желанию)

    // Метод для поиска информации в справочной книге
    public boolean searchRefBook(String query) {
        // Здесь вы можете реализовать логику поиска в справочной книге
        // Например, можно проверить, содержит ли информация в справочной книге заданный запрос
        // и вернуть true, если информация найдена, и false в противном случае.

        // Пример простой реализации:
        if (referenceInfo != null && referenceInfo.toString().contains(query)) {
            return true;
        }

        return false;
    }
}
