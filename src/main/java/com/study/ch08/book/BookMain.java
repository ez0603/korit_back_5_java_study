package com.study.ch08.book;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String SelectMenu = null;
        Book[] books = new Book[3];
        boolean loopFlag = true;
        BookRepository bookRepository = new BookRepository(books);
        BookService bookService = new BookService(bookRepository);




        while (loopFlag) {
            System.out.println(">>> 도서 목록 프로그램 <<<");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 조회 ");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>> ");
            SelectMenu = scanner.nextLine();

            if ("q".equalsIgnoreCase(SelectMenu)) {
                System.out.println("프로그램을 종료합니다.");
                loopFlag = false;

            } else if("1".equals(SelectMenu)) {
                System.out.println(">>> 도서 등록 페이지 <<<");
                int emptyCount = 0;

                String bookName = null;
                String writer = null;


                System.out.print("책 이름 >>> ");
                bookName = scanner.nextLine();
                System.out.print("저자 이름 >>> ");
                writer = scanner.nextLine();

                Book book = new Book(bookName, writer);

                for (int i = 0; i < books.length; i++) {
                    if (books[i] == null) {
                        books[i] = book;
                        break;
                    }
                }
                for (int i = 0; i < books.length; i++) {
                    int emptyIndex = 0;

                    if (books[i] == null) {
                        emptyIndex = i;
                        break;
                    }
                    System.out.println(books[i].toString());
                }

            } else if ("2".equals(SelectMenu)) {
                System.out.println(">>> 등록된 도서 조회 페이지 <<<");
                    for (int i = 0; i < books.length; i++) {
                        System.out.print("[" + i + "] > ");
                        if (books[i] == null) {
                            System.out.println("X");
                            continue;
                        }
                        System.out.println(books[i].toString());
                    }
            } else {
                System.out.println("다시 입력하세요.");
            }
        }
        System.out.println("프로그램을 종료합니다.");

    }
}
