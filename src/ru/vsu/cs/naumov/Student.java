package ru.vsu.cs.naumov;

import java.util.Date;

public class Student<T> extends Member {
    private String sName;
    private String studentColl;

    public Student(String mName, String mAddress, Integer mNo, String sName, String studentColl) {
        super(mName, mAddress, mNo);
        this.sName = sName;
        this.studentColl = studentColl;
    }

    // Геттеры и сеттеры для полей sName и studentColl (по желанию)

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getStudentColl() {
        return studentColl;
    }

    public void setStudentColl(String studentColl) {
        this.studentColl = studentColl;
    }

    // Метод для выдачи книги студенту
    public void checkOutBook(Books book, Date returnDate) {
        // Создаем запись Alert о выдаче книги
        Alert alert = new Alert(new Date(), book.getBookName(), returnDate, 0); // 0 - начальный размер штрафа

        // Уменьшаем количество доступных книг на 1
        book.decrementNoOfBooks();

        // Добавляем запись Alert в список у студента
        addAlert(alert);
    }

    // Метод для возврата книги студентом
    public void returnBook(Books book) {
        // Ищем запись Alert о выдаче этой книги студенту
        Alert alertToRemove = null;
        for (Alert alert : getAlerts()) {
            if (alert.getBookName().equals(book.getBookName())) {
                alertToRemove = alert;
                break;
            }
        }

        if (alertToRemove != null) {
            // Увеличиваем количество доступных книг на 1
            book.incrementNoOfBooks();

            // Удаляем запись Alert из списка у студента
            removeAlert(alertToRemove);
        }
    }
}
