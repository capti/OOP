package ru.vsu.cs.naumov;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class LibrarySystem {
    public static void main(String[] args) {
        // Создаем каталог книг
        Catalog catalog1 = new Catalog("Author 1", "Book 1", 5);
        Catalog catalog2 = new Catalog("Author 2", "Book 2", 3);

        // Создаем список студентов и факультетских членов
        List<Student<String>> students = new ArrayList<>();
        students.add(new Student<>("Student 1", "Address 1", 101, "StudentName 1", "College 1"));
        students.add(new Student<>("Student 2", "Address 2", 102, "StudentName 2", "College 2"));

        List<FacultyMember<String>> facultyMembers = new ArrayList<>();
        facultyMembers.add(new FacultyMember<>("Faculty 1", "Address 3", 201, "FacultyName 1", "Department 1"));
        facultyMembers.add(new FacultyMember<>("Faculty 2", "Address 4", 202, "FacultyName 2", "Department 2"));

        // Создаем библиотекаря
        Librarian librarian = new Librarian("LibrarianName", "LibraryAddress", 301);

        // Выполняем операции выдачи и возврата книг
        Student<String> student = students.get(0);
        FacultyMember<String> facultyMember = facultyMembers.get(0);

        librarian.issueBooks(student, catalog1, new Date());
        librarian.issueBooks(facultyMember, catalog2, new Date());

        // Выводим информацию о членах библиотеки
        System.out.println("Student Information:");
        System.out.println("Name: " + student.getmName());
        System.out.println("Address: " + student.getmAddress());
        System.out.println("College: " + student.getStudentColl());

        System.out.println("\nFaculty Member Information:");
        System.out.println("Name: " + facultyMember.getmName());
        System.out.println("Address: " + facultyMember.getmAddress());
        System.out.println("Department: " + facultyMember.getFacultyColl());

        // Выводим информацию о книгах в каталоге
        System.out.println("\nCatalog Information:");
        System.out.println("Book 1 - Copies: " + catalog1.getNoOfCopies());
        System.out.println("Book 2 - Copies: " + catalog2.getNoOfCopies());
    }
}

