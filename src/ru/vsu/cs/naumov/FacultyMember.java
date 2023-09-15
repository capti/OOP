
package ru.vsu.cs.naumov;

import java.util.Date;

public class FacultyMember<T> extends Member {
    private String fName;
    private String facultyColl;

    public FacultyMember(String mName, String mAddress, Integer mNo, String fName, String facultyColl) {
        super(mName, mAddress, mNo);
        this.fName = fName;
        this.facultyColl = facultyColl;
    }

    // Геттеры и сеттеры для полей fName и facultyColl (по желанию)

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getFacultyColl() {
        return facultyColl;
    }

    public void setFacultyColl(String facultyColl) {
        this.facultyColl = facultyColl;
    }

    // Метод для выдачи книги факультетскому члену
    public void checkOutBook(Books book, Date returnDate) {
        // Создаем запись Alert о выдаче книги
        Alert alert = new Alert(new Date(), book.getBookName(), returnDate, 0); // 0 - начальный размер штрафа

        // Уменьшаем количество доступных книг на 1
        book.decrementNoOfBooks();

        // Добавляем запись Alert в список у факультетского члена
        addAlert(alert);
    }
}
