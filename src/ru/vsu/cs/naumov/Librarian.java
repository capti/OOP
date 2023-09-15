package ru.vsu.cs.naumov;

import java.util.Date;
import java.util.List;

public class Librarian {

    public String name;

    public String address;

    public Integer mobileNo;

    public Librarian(String name, String address, Integer mobileNo) {
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
    }

    // Метод для обновления информации о библиотекаре
    public void updateInfo(String newName, String newAddress, Integer newMobileNo) {
        this.name = newName;
        this.address = newAddress;
        this.mobileNo = newMobileNo;
    }

    // Метод для выдачи книги члену библиотеки
    public void issueBooks(Member member, Books book, Date returnDate) {
        // Создаем запись Alert о выдаче книги
        Alert alert = new Alert(new Date(), book.getBookName(), returnDate, 0); // 0 - начальный размер штрафа

        // Уменьшаем количество доступных книг на 1
        book.decrementNoOfBooks();

        // Добавляем запись Alert в список у члена библиотеки
        member.addAlert(alert);
    }

    // Метод для получения информации о члене библиотеки
    public Member memberInfo(String mName, List<Member> members) {
        // Ищем члена по имени
        for (Member member : members) {
            if (member.getmName().equals(mName)) {
                return member;
            }
        }
        return null; // Если член не найден

    }

    // Метод для поиска книги в библиотеке
    public Books searchBook(String bookName, List<Books> books) {
        // Ищем книгу по названию
        for (Books book : books) {
            if (book.getBookName().equals(bookName)) {
                return book;
            }
        }
        return null; // Если книга не найдена
    }

    // Метод для возврата книги членом библиотеки
    public void returnBook(Member member, Books book) {
        // Ищем запись Alert о выдаче этой книги члену
        Alert alertToRemove = null;
        for (Alert alert : member.getAlerts()) {
            if (alert.getBookName().equals(book.getBookName())) {
                alertToRemove = alert;
                break;
            }
        }

        if (alertToRemove != null) {
            // Увеличиваем количество доступных книг на 1
            book.incrementNoOfBooks();

            // Удаляем запись Alert из списка у члена библиотеки
            member.removeAlert(alertToRemove);
        }
    }
}
