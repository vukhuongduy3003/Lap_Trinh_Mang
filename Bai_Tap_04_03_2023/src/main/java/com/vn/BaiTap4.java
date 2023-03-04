package com.vn;

import com.vn.entity.Book;
import com.vn.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap4 {
    private static Scanner scanner = new Scanner(System.in);

    public static Book InputBook() {
        Book book = new Book();
        System.out.print("Nhập tên sách: ");
        book.setBookName(scanner.nextLine());
        System.out.print("Nhập tác giả: ");
        book.setBookAuthor(scanner.nextLine());
        System.out.print("Nhập nhà xuất bản: ");
        book.setProducer(scanner.nextLine());
        System.out.print("Nhập năm xuất bản: ");
        book.setYearPublishing(NhapSoNguyenDuong());
        System.out.print("Nhập giá tiền: ");
        book.setPrice(NhapSoThucDuong());
        return book;
    }

    public static Integer NhapSoNguyenDuong() {
        Integer n = -1;
        do {
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n < 1) {
                    System.out.print("Số bạn nhập phải là số nguyên dương khác 0. Mời bạn nhập lại: ");
                }
            } catch (NumberFormatException exception) {
                System.out.print("Bạn nhập sai định dạng. Mời bạn nhập lại: ");
            }
        }
        while (n < 1);
        return n;
    }

    public static Float NhapSoThucDuong() {
        Float n = -1f;
        do {
            try {
                n = Float.parseFloat(scanner.nextLine());
                if (n < 1) {
                    System.out.print("Số bạn nhập phải là số thực dương khác 0. Mời bạn nhập lại: ");
                }
            } catch (NumberFormatException exception) {
                System.out.print("Bạn nhập sai định dạng. Mời bạn nhập lại: ");
            }
        }
        while (n < 1);
        return n;
    }

    public static void Menu() {
        System.out.println("1. Nhập thông tin n cuốn sách Book.");
        System.out.println("2. Hiển thị thông tin vừa nhập.");
        System.out.println("3. Sắp xếp thông tin giảm dần theo năm xuất bản.");
        System.out.println("4. Tìm kiếm theo tên sách.");
        System.out.println("5. Tìm kiếm tên tác giả.");
        System.out.println("6. Thoát.");
    }

    public BaiTap4() {
        List<Book> bookList = new ArrayList<>();
        Integer choose = 0;
        do {
            Menu();
            System.out.print("Mời bạn nhập lựa chọn: ");
            choose = NhapSoNguyenDuong();
            if (1 > choose || choose > 6) {
                System.out.println("Không có lựa chọn này! Mời bạn nhập lại.");
                continue;
            }
            switch (choose) {
                case 1 -> {
                    System.out.print("Nhập số lượng sách cần lưu là: ");
                    Integer n = NhapSoNguyenDuong();
                    bookList.clear();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Thông tin sách thứ " + (i + 1) + " là:");
                        bookList.add(InputBook());
                    }
                }
                case 2 -> {
                    System.out.println("\nHiển thị danh sách sách:");
                    bookList.forEach(System.out::println);
                }
                case 3 -> {
                    System.out.println("\nSắp xếp sách theo năm giảm dần: ");
                    bookList.sort((book1, book2) -> book2.getYearPublishing().compareTo(book1.getYearPublishing()));
                    bookList.forEach(System.out::println);
                }
                case 4 -> {
                    System.out.print("\nNhập tên sách cần tìm: ");
                    String s = scanner.nextLine();
                    System.out.println("Danh sách sách được tìm thấy là:");
                    boolean check = true;
                    for (Book book : bookList) {
                        if (book.getBookName().toLowerCase().compareTo(s.toLowerCase()) == 0) {
                            check = false;
                            System.out.println(book);
                        }
                    }
                    if (check) {
                        System.out.println("Không có sách nào tên '" + s + "' được tìm thấy.");
                    }
                }
                case 5 -> {
                    System.out.print("\nNhập tên tác giả cần tìm: ");
                    String s = scanner.nextLine();
                    System.out.println("Danh sách sách được tìm thấy là:");
                    boolean check = true;
                    for (Book book : bookList) {
                        if (book.getBookAuthor().toLowerCase().compareTo(s.toLowerCase()) == 0) {
                            check = false;
                            System.out.println(book);
                        }
                    }
                    if (check) {
                        System.out.println("Không có sách nào có tên tác giả '" + s + "' được tìm thấy.");
                    }
                }
                case 6 -> {
                    System.out.println("Đã thoát chương trình!");
                }
            }
            if (choose == 6) {
                break;
            }
            choose = 0;
        } while (1 > choose || choose > 6);
    }
}
