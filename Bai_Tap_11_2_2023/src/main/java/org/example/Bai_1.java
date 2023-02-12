package org.example;

import java.util.Scanner;

public class Bai_1 {

    private final Scanner scanner = new Scanner(System.in);
    public void Bai_1() {
        System.out.println("________________Bài 1________________");
        System.out.print("Nhập 1 chữ cái từ bàn phím: ");
        char character = scanner.next().charAt(0);
        switch (character) {
            case 'a', 'ă', 'â', 'e', 'ê', 'i', 'o', 'ô', 'ơ', 'u', 'ư', 'y' -> System.out.println("Ký tự đầu tiên mà bạn vừa nhập là nguyên âm.");
            case 'b', 'c', 'd', 'đ', 'g', 'h', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x' ->
                    System.out.println("Ký tự đầu tiên mà bạn vừa nhập là phụ âm.");
            default -> System.out.println("Ký tự đầu tiên mà bạn vừa nhập không phải là nguyên âm, không phải là phụ âm");
        }
    }
}
