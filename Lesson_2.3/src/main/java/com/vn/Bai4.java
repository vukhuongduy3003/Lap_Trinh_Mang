package com.vn;

import java.util.*;
import java.util.stream.IntStream;

public class Bai4 {
    private Scanner scanner = new Scanner(System.in);

    public Integer InputIntegerPositive(Integer integerPositive) {
        do {
            try {
                integerPositive = Integer.parseInt(scanner.nextLine());
                if (integerPositive < 0) {
                    System.out.println("Số bạn vừa nhập không phải là số nguyên dương!");
                    System.out.print("Mời bạn nhập lại: ");
                } else if (integerPositive == 0) {
                    System.out.println("Số 0 không phải là số nguyên âm và không phải là số nguyên dương!");
                    System.out.print("Mời bạn nhập lại: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là kiểu số nguyên.");
                System.out.print("Mời bạn nhập lại: ");
            }
        } while (integerPositive <= 0);
        return integerPositive;
    }

    public Bai4() {
        Integer value, sum = 0, max, maxSecond;
        List<Integer> integerList = new ArrayList<>();
        System.out.println("Mời bạn thêm phần tử vào trong mảng: ");
        do {
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value == 0) {
                    break;
                }
                integerList.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là kiểu số nguyên.");
                System.out.print("Mời bạn nhập lại: ");
            }
        } while (true);
        for (Integer integer : integerList) {
            sum += integer;
        }
        System.out.println("Mảng vừa nhập là: " + integerList);
        System.out.println("Tổng các số vừa nhập trong mảng là: " + sum);
        System.out.print("Số lớn thứ 2 trong mảng là: ");
        max = Collections.max(integerList);
        List<Integer> sortList = new ArrayList<>(integerList);
        Collections.sort(sortList);
        Collections.reverse(sortList);
        for (Integer integer : sortList) {
            if (max > integer) {
                System.out.println(integer);
                break;
            }
        }
        Integer addValue;
        boolean check = true;
        System.out.print("Nhập số x muốn thêm: ");
        do {
            try {
                addValue = Integer.parseInt(scanner.nextLine());
                Integer finalAddValue = addValue;
                List<Integer> indices = IntStream.range(0, integerList.size())
                        .filter(i -> integerList.get(i).equals(finalAddValue))
                        .boxed()
                        .toList();
                if (indices.size() != 0) {
                    System.out.print("Phần tử vừa bạn muốn thêm đã có trong mảng và ở vị trí: " + indices);
                    break;
                }
                else {
                    integerList.add(addValue);
                    System.out.println("Đã thêm phần tử vừa nhập vào trong mảng.");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là kiểu số nguyên.");
                System.out.print("Mời bạn nhập lại: ");
                check = false;
            }
        } while (!check);
    }
}
