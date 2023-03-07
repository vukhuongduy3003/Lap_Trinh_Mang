package com.vn;

import com.vn.entity.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_3 {
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("1. Nhập thông tin xe.");
        System.out.println("2. Xuất bản kê khai tiền thuế.");
        System.out.println("3. Thoát");
    }

    public Integer InputIntegerPositive() {
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

    public Vehicle inputVehicle() {
        Vehicle vehicle = new Vehicle();
        System.out.print("Nhập mã xe: ");
        vehicle.setMaXe(InputIntegerPositive());
        System.out.print("Nhập tên xe: ");
        vehicle.setTenXe(scanner.nextLine());
        System.out.print("Nhập chủ xe: ");
        vehicle.setChuXe(scanner.nextLine());
        System.out.print("Nhập giá xe: ");
        vehicle.setGiaXe(InputIntegerPositive());
        System.out.print("Nhập dung tích: ");
        vehicle.setDungTich(InputIntegerPositive());
        return vehicle;
    }

    public void inputVehicleList(List<Vehicle> vehicleList) {
        System.out.print("Nhập số lượng xe cần đăng ký là: ");
        int n = InputIntegerPositive();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin đăng ký xe thứ " + (i + 1) + " là:");
            vehicleList.add(inputVehicle());
        }
    }

    public void outputVehicleList(List<Vehicle> vehicleList) {
        System.out.println("Hiển thị danh sách đăng ký xe:");
        vehicleList.forEach(System.out::println);
    }

    public Bai_3() {
        Integer choose = 0;
        List<Vehicle> vehicleList = new ArrayList<>();
        do {
            menu();
            System.out.print("Mời bạn nhập lựa chọn: ");
            choose = InputIntegerPositive();
            switch (choose) {
                case 1 -> {
                    inputVehicleList(vehicleList);
                }
                case 2 -> {
                    outputVehicleList(vehicleList);
                }
                case 3 -> System.out.println("Đã thoát chương trình");
                default -> System.out.println("Không có lựa chọn này!");
            }
        } while (choose != 3);
    }
}
