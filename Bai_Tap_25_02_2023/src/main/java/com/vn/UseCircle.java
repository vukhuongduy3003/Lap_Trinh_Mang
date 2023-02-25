package com.vn;

import java.util.*;

public class UseCircle {
    private Scanner scanner = new Scanner(System.in);

    public UseCircle() {
        List<Circle> circleList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Circle circle = new Circle();
            System.out.println("Nhập thông tin Circle thứ " + (i + 1) + " là:");
            System.out.print("Radius = ");
            circle.setRadius(InputDoublePositive());
            System.out.print("color: ");
            circle.setColor(scanner.nextLine());
            circleList.add(circle);
        }
        System.out.println("Hiển thị danh sách Circle:");
        circleList.forEach(System.out::println);
        System.out.println("Hiển thị danh sách Circle có diện tích lớn thứ 2:");
        Double numberSecond = SearchNumberSecond(circleList);
        circleList.forEach(item -> {
            if (Objects.equals(item.getArea(), numberSecond)) {
                System.out.println(item);
            }
        });
    }

    private Double SearchNumberSecond(List<Circle> circleList) {
        circleList.sort(Comparator.comparing(Circle::getArea));
        Collections.reverse(circleList);
        Double maxNumber = circleList.get(0).getArea();
        for (Circle circle : circleList) {
            if (circle.getArea() < maxNumber) {
                return circle.getArea();
            }
        }
        return 0.0;
    }

    private Double InputDoublePositive() {
        Double doublePositive = 0d;
        do {
            try {
                doublePositive = Double.parseDouble(scanner.nextLine());
                if (doublePositive <= 0d) {
                    System.out.println("Số bạn vừa nhập không phải là số thực dương!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là kiểu số thực.");
                System.out.print("Mời bạn nhập lại: ");
            }
        } while (doublePositive <= 0d);
        return doublePositive;
    }
}
