package my.com;

import java.util.Scanner;

public class Lesson_1 {
    private Scanner scanner = new Scanner(System.in);

    public void Bai_1() {
        System.out.print("Nhập số nguyên: ");
        Integer a = scanner.nextInt();
        System.out.print("Nhập số thực: ");
        Double b = scanner.nextDouble();
        System.out.print("Nhập ký tự: ");
        Character character = scanner.next().charAt(0);
        System.out.print("Nhập chuỗi: ");
        scanner.nextLine();
        String string = scanner.nextLine();
        System.out.println("Số nguyên vừa nhập là: " + a);
        System.out.println("Số thực vừa nhập là: " + b);
        System.out.println("Ký tự vừa nhập là: " + character);
        System.out.println("Chuỗi vừa nhập là: " + string);
    }

    public void Bai_2() {
        System.out.print("Nhập a: ");
        Double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        Double b = scanner.nextDouble();
        System.out.println("Số lớn nhất là: " + Math.max(a, b));
        System.out.println("Số nhỏ nhất là: " + Math.min(a, b));
    }

    public void Bai_3() {
        Integer a;
        do {
            System.out.print("Nhập hệ số a: ");
            a = scanner.nextInt();
            if (a == 0) {
                System.out.println("Nhập sai! Hệ số a khác 0, mời bạn nhập lại.");
            }
        } while (a == 0);
        System.out.print("Nhập hệ số b: ");
        Integer b = scanner.nextInt();
        System.out.print("Nhập hệ số c: ");
        Integer c = scanner.nextInt();
        Integer delta = b * b - 4 * a * c;
        if (delta < 0)
            System.out.println("Phương trình vô nghiệm");
        else if (delta == 0) {
            float x = (float) -b / (2 * a);
            System.out.printf("Phương trình có nghiệm kép là x1=x2=%.2f", x);
        } else {
            float x1 = (float) (-b - Math.sqrt(delta)) / (2 * a);
            float x2 = (float) (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            System.out.printf("\tx1=%.2f \n", x1);
            System.out.printf("\tx2=%.2f \n", x2);
        }
    }

    public void Bai_4() {
        System.out.print("Nhập số điện: ");
        Integer a = scanner.nextInt();
        if (0 <= a && a <= 50) {
            System.out.println("Tiền điện là: " + a * 5000);
        } else if (a > 50) {
            System.out.println("Tiền điện là: " + 50 * 5000 + (a - 50) * 1200);
        }
    }

    public void Bai_5() {

    }
}
