package vkduy.com;

import java.util.*;

public class Bai3 {
    private Scanner scanner = new Scanner(System.in);
    public Integer InputIntegerPositive(Integer integerPositive) {
        do {
            try {
                integerPositive = Integer.parseInt(scanner.nextLine());
                if (integerPositive < 0) {
                    System.out.println("Số bạn vừa nhập không phải là số nguyên dương!");
                    System.out.print("Mời bạn nhập lại: ");
                }
                else if(integerPositive == 0) {
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

    public List<Integer> inputArrays() {
        Integer n = 0;
        List<Integer> integerPositiveList = new ArrayList<>();
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        n = InputIntegerPositive(n);
        for (int i = 0; i < n; i++) {
            System.out.print("Số nguyên thứ " + (i + 1) + " là: ");
            Integer value = 0;
            do {
                try {
                    value = Integer.parseInt(scanner.nextLine());
                    integerPositiveList.add(value);
                } catch (NumberFormatException e) {
                    System.out.println("Lựa chọn phải là kiểu số nguyên.");
                    System.out.print("Mời bạn nhập lại: ");
                }
            } while (value == 0.0);
        }
        return integerPositiveList;
    }

    public List<Integer> SortArrays(List<Integer> integerPositiveList) {
        Collections.sort(integerPositiveList);
        return integerPositiveList;
    }

    public void DisplayArrays(List<Integer> integerPositiveList) {
        System.out.print("Hiển thị mảng sau khi đã sắp xếp là: ");
        System.out.println(integerPositiveList);
    }

    public void DisplayMinItem(List<Integer> integerPositiveList) {
        System.out.print("Phần tử nhỏ nhất trong mảng: " + integerPositiveList.get(0));
    }

    public void DisplayAverageItemDivide3(List<Integer> integerPositiveList) {
        Integer sum = 0;
        Integer count = 0;
        for (Integer integer : integerPositiveList) {
            if (integer % 3 == 0) {
                sum += integer;
                count ++;
            }
        }
        System.out.print("\nTrung bình cộng phần tử chia hết cho 3 trong mảng: " + sum * 1.0 / count);
    }

}
