package my.com;

import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.math3.util.Pair;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson_1 {
    private Scanner scanner = new Scanner(System.in);

    public void Bai_1() {
        System.out.println("Bài 1.");
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
        System.out.println("Bài 2.");
        System.out.print("Nhập a: ");
        Double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        Double b = scanner.nextDouble();
        System.out.println("Số lớn nhất là: " + Math.max(a, b));
        System.out.println("Số nhỏ nhất là: " + Math.min(a, b));
    }

    public void Bai_3() {
        System.out.println("Bài 3.");
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
        System.out.println("Bài 4.");
        System.out.print("Nhập số điện: ");
        Integer a = scanner.nextInt();
        if (0 <= a && a <= 50) {
            System.out.println("Tiền điện là: " + a * 5000);
        } else if (a > 50) {
            System.out.println("Tiền điện là: " + 50 * 5000 + (a - 50) * 1200);
        }
    }

    private void MenuBai5() {
        System.out.println("1. Nhập vào số nguyên dương n.");
        System.out.println("2. Tính tổng :1+1/2+1/3+....+1/n.");
        System.out.println("3. Tính tổng :1+1/2!+1/3!+....+1/n!.");
        System.out.println("4. Thoát.");
    }

    private Integer InputIntegerPositive(Integer integerPositive) {
        do {
            try {
                System.out.print("Mời bạn nhập số nguyên duơng: ");
                integerPositive = Integer.parseInt(scanner.nextLine());
                if (integerPositive < 0) {
                    System.out.println("Số bạn vừa nhập không phải là số nguyên dương!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là kiểu số nguyên.");
            }
        } while (integerPositive < 0);
        return integerPositive;
    }

    private AbstractMap.SimpleEntry<Long, Long> TotalFraction(AbstractMap.SimpleEntry<Long, Long> fraction1, AbstractMap.SimpleEntry<Long, Long> fraction2) {
        Long num1 = fraction1.getKey();
        Long den1 = fraction1.getValue();
        Long num2 = fraction2.getKey();
        Long den2 = fraction2.getValue();
        Long num, den, x;
        //logic for calculating sum of two fractions
        if (den1 == den2) {
            num = num1 + num2;
            den = den1;
        } else {
            num = (num1 * den2) + (num2 * den1);
            den = den1 * den2;
        }
        if (num > den)
            x = num;
        else
            x = den;
        for (Long i = 1L; i <= x; i++) {
            if (num % i == 0 && den % i == 0) {
                num = num / i;
                den = den / i;
            }
        }
        //logic for getting simplified fraction
        Long n = 1L;
        Long p = num;
        Long q = den;
        if (num != den) {
            while (n != 0) {
                //storing remainder
                n = num % den;
                if (n != 0) {
                    num = den;
                    den = n;
                }
            }
        }
        return new AbstractMap.SimpleEntry<>(p / den, q / den);
    }

    public Long factorialUsingApacheCommons(int n) {
        return CombinatoricsUtils.factorial(n);
    }

    private AbstractMap.SimpleEntry<Long, Long> Total(Integer choose, Integer n) {
        AbstractMap.SimpleEntry<Long, Long> sum = new AbstractMap.SimpleEntry<>(1L, 1L);
        if (choose == 2) {
            for (Integer i = 2; i <= n; i++) {
                sum = TotalFraction(sum, new AbstractMap.SimpleEntry<>(1L, Long.valueOf(i)));
            }
        } else if (choose == 3) {
            for (Integer i = 2; i <= n; i++) {
                sum = TotalFraction(sum, new AbstractMap.SimpleEntry<>(1L, factorialUsingApacheCommons(i)));
            }
        }
        return sum;
    }

    public void Bai_5() {
        System.out.println("Bài 5.");
        Integer choose = 0;
        Integer n = 0;
        do {
            MenuBai5();
            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1 -> {
                        n = InputIntegerPositive(n);
                        System.out.println("Số nguyên dương của bạn vừa nhập là: " + n);
                    }
                    case 2 ->
                            System.out.println("Tổng là: " + Total(choose, n).getKey() + "/" + Total(choose, n).getValue());
                    case 3 ->
                            System.out.println("Tổng là: " + Total(choose, n).getKey() + "/" + Total(choose, n).getValue());
                    case 4 -> System.out.println("Đã thoát chương trình!");
                    default -> System.out.println("Không có lựa chọn!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là kiểu số nguyên.");
            }
        } while (choose != 4);
    }

    private void MenuBai6() {
        System.out.println("1. Nhập vào số nguyên dương n.");
        System.out.println("2. Tính tổng từ 1 đến n.");
        System.out.println("3. Kiểm tra n có phải là số nguyên tố.");
        System.out.println("4. Kiểm tra n có phải là số hoàn hảo.");
        System.out.println("5. Thoát.");
    }

    private Integer TotalOneToN(Integer n) {

        return n * (n + 1) / 2;
    }

    boolean isPrime(Integer n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (Integer i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    boolean isPerfect(Integer n) {
        // 1 is not a perfect number
        if (n == 1)
            return false;

        // sum will store the sum of proper divisors
        // As 1 is a proper divisor for all numbers
        // initialised sum with 1
        Integer sum = 1;

        // Looping through the numbers to check if they are
        // divisors or not
        for (Integer i = 2; i < n; i++) {

            if (n % i == 0) {
                sum += i;
            }

        }

        // If sum of divisors is equal to
        // n, then n is a perfect number
        if (sum == n)
            return true;

        return false;
    }

    public void Bai_6() {
        System.out.println("Bài 6.");
        Integer choose = 0;
        Integer n = 0;
        do {
            MenuBai6();
            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1 -> {
                        n = InputIntegerPositive(n);
                        System.out.println("Số nguyên dương của bạn vừa nhập là: " + n);
                    }
                    case 2 -> System.out.println("Tổng các số từ 1 đến " + n + " là: " + TotalOneToN(n));
                    case 3 -> {
                        if (isPrime(n)) {
                            System.out.println("Số " + n + " là số nguyên tố.");
                        } else {
                            System.out.println("Số " + n + " không là số nguyên tố.");
                        }
                    }
                    case 4 -> {
                        if (isPerfect(n)) {
                            System.out.println("Số " + n + " là số hoàn hảo.");
                        } else {
                            System.out.println("Số " + n + " không là số hoàn hảo.");
                        }
                    }
                    case 5 -> System.out.println("Đã thoát chương trình!");
                    default -> System.out.println("Không có lựa chọn!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là kiểu số nguyên.");
            }
        } while (choose != 5);
    }

    // Recursive method to return gcd of a and b
    private Integer gcd(Integer a, Integer b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // method to return LCM of two numbers
    private Integer lcm(Integer a, Integer b) {
        return (a / gcd(a, b)) * b;
    }

    public void Bai_7() {
        System.out.println("Bài 7.");
        Integer a = 0;
        Integer b = 0;
        a = InputIntegerPositive(a);
        b = InputIntegerPositive(b);
        System.out.println("UCLN của " + a + " và " + b + " là: " + gcd(a, b));
        System.out.println("BCNN của " + a + " và " + b + " là: " + lcm(a, b));
    }

    private void MenuBai8() {
        System.out.println("1. Kiểm tra n có phải là số nguyên tố.");
        System.out.println("2. In ra các số nguyên tố từ 1 đến n.");
        System.out.println("3. Thoát.");
    }

    private void ShowNumberPrime(Integer n) {
        System.out.print("Danh sách số nguyên tố từ 1 đến " + n + " là: ");
        for (Integer i = 0; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + "; ");
            }
        }
    }

    public void Bai_8() {
        System.out.println("Bài 8.");
        Integer choose = 0;
        Integer n = 0;
        n = InputIntegerPositive(n);
        do {
            MenuBai8();
            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1 -> {
                        if (isPrime(n)) {
                            System.out.println("Số " + n + " là số nguyên tố.");
                        } else {
                            System.out.println("Số " + n + " không là số nguyên tố.");
                        }
                    }
                    case 2 -> ShowNumberPrime(n);
                    case 3 -> System.out.println("Đã thoát chương trình!");
                    default -> System.out.println("Không có lựa chọn!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là kiểu số nguyên.");
            }
        } while (choose != 3);
    }

    private Integer InputInteger() {
        boolean check = false;
        Integer integer = 0;
        do {
            try {
                System.out.print("Mời bạn nhập số nguyên: ");
                integer = Integer.parseInt(scanner.nextLine());
                check = true;
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là kiểu số nguyên.");
            }
        } while (!check);
        return integer;
    }

    public void Bai_9() {
        System.out.println("Bài 9.");
        Integer n = 0;
        n = InputIntegerPositive(n);
        HashMap<Integer, Integer> array = new HashMap<Integer, Integer>();
        for (Integer i = 0; i < n; i++) {
            array.put(InputInteger(), i);
        }
        boolean check = false;
        Integer number = 0;
        do {
            try {
                System.out.print("Mời bạn nhập số muốn tìm kiếm: ");
                number = Integer.parseInt(scanner.nextLine());
                if (array.containsKey(number)) {
                    System.out.println("Số bạn vừa nhập ở vị trí " + array.get(number));
                } else {
                    System.out.println("Số bạn vừa nhập không có trong mảng.");
                }
                check = true;
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là kiểu số nguyên.");
            }
        } while (!check);
    }

    public void Bai_10() {
        System.out.println("Bài 10.");
        Integer n = 0;
        n = InputIntegerPositive(n);
        List<Integer> integerList = new ArrayList<>();
        for (Integer i = 0; i < n; i++) {
            integerList.add(InputInteger());
        }
        Collections.sort(integerList);
        System.out.print("Mảng sau khi đã sắp xếp là: " + integerList + "\n");
        System.out.println("Phần tử có giá trị nhỏ nhất là: " + integerList.get(0));
        List<Integer> stream = (integerList.stream().filter(c -> c % 3 == 0)).toList();
        System.out.println("Trung bình cộng của phần tử chia hết cho 3 trong mảng là: " + stream.stream().reduce(0, Integer::sum) * 1.0 / stream.size());
    }

    public void Bai_11() {
        System.out.println("Bài 11.");
        Integer n = 0;
        n = InputIntegerPositive(n);
        List<Integer> array = new ArrayList<Integer>();
        for (Integer i = 0; i < n; i++) {
            array.add(InputInteger());
        }
        boolean check = false;
        Integer number = 0;
        do {
            try {
                System.out.print("Mời bạn nhập số muốn tìm kiếm: ");
                number = Integer.parseInt(scanner.nextLine());
                if (array.contains(number)) {
                    array.removeAll(Collections.singleton(number));
                    System.out.print("Mảng sau khi xoá là: " + array);
                } else {
                    System.out.println("Số bạn vừa nhập không có trong mảng.");
                }
                check = true;
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là kiểu số nguyên.");
            }
        } while (!check);
    }

    public void Bai_12() {
        System.out.println("Bài 12.");
        Integer n = 0;
        n = InputIntegerPositive(n);
        List<Integer> array = new ArrayList<Integer>();
        for (Integer i = 0; i < n; i++) {
            array.add(InputInteger());
        }
        System.out.println("Danh sách các số nguyên tố trong mảng là: " + array.stream().filter(c -> isPrime(c)).toList());
        System.out.println("Danh sách các số hoàn hảo trong mảng là: " + array.stream().filter(c -> isPerfect(c)).toList());
        System.out.println("Danh sách các số chẵn trong mảng là: " + array.stream().filter(c -> c % 2 == 0).toList());
    }

    private List<Integer> InsertionSort(List<Integer> numbers) {
        for (Integer i = 1; i < numbers.size(); i++) {
            Integer current = numbers.get(i);
            Integer j = i - 1;
            while (j >= 0 && numbers.get(j) > current) {
                numbers.set(j + 1, numbers.get(j));
                j--;
            }
            numbers.set(j + 1, current);
        }
        return numbers;
    }

    public void Bai_13() {
        System.out.println("Bài 13.");
        Integer n = 0;
        n = InputIntegerPositive(n);
        List<Integer> array = new ArrayList<Integer>();
        for (Integer i = 0; i < n; i++) {
            array.add(InputInteger());
        }
        System.out.println("Mảng được sắp xếp tăng dần theo thuật toán InsertionSort là: " + InsertionSort(array));
    }

    private Integer Fibonacci(Integer n) {
        if (n < 2) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public void Bai_14() {
        System.out.println("Bài 14.");
        Integer n = 0;
        n = InputIntegerPositive(n);
        System.out.println("Số Fibonacci ở thứ " + n + " là: " + Fibonacci(n));
        List<Integer> array = new ArrayList<>();
        for (Integer i = 2; i < n; i++) {
            array.add(Fibonacci(i));
        }
        System.out.println("Danh sách các số Fibonacci nhỏ hơn " + n + " là các số nguyên tố: " + array.stream().filter(this::isPrime).toList());
    }

    public void Bai_15() {
        System.out.println("Bài 15.");
        Integer n = 0;
        n = InputIntegerPositive(n);
        HashMap<Integer, Integer> array = new HashMap<>();
        Integer number;
        for (Integer i = 1; i <= n; i++) {
            number = 0;
            do {
                try {
                    System.out.print("Phần tử thứ " + i + " là: ");
                    number = Integer.parseInt(scanner.nextLine());
                    if (0 >= number || number >= 100) {
                        System.out.println("Mời bạn nhập lại! Phần tử trong mảng có giá trị lớn hơn 0 và nhỏ hơn 100.");
                    } else {
                        array.put(i, number);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Lựa chọn phải là kiểu số nguyên.");
                }
            } while (0 >= number || number >= 100);
        }

    }

    private String Convert(String str) {
        String tmp = "";
        tmp += String.valueOf(str.charAt(0)).toUpperCase();
        tmp += str.substring(1); //tmp+=str.substring(1, str.length());
        return tmp;
    }

    public void Bai_16() {
        System.out.println("Bài 16.");
        System.out.print("Nhập vào chuỗi kỹ tự muốn chuyển hoá: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer tok = new StringTokenizer(str, " ");
        while (tok.hasMoreTokens()) {
            System.out.print(Convert(tok.nextToken()) + " ");
        }
    }

    public void Bai_17() {
        System.out.println("Bài 17.");
        Integer a = 0;
        System.out.println("Số hàng: ");
        a = InputIntegerPositive(a);
        Integer b = 0;
        System.out.println("Số cột: ");
        b = InputIntegerPositive(b);
        List<List<Integer>> matrix = new ArrayList<>(a);
        for (Integer i = 0; i < a; i++) {
            List<Integer> row = new ArrayList<>();
            for (Integer j = 0; j < b; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                row.add(InputInteger());
            }
            matrix.add(row);
        }
        System.out.println("Ma trận vừa nhập: " + matrix);
    }

    public void Bai_18() {
        System.out.println("Bài 18.");
        Integer a = 0;
        System.out.println("Số hàng: ");
        a = InputIntegerPositive(a);
        Integer b = 0;
        System.out.println("Số cột: ");
        b = InputIntegerPositive(b);
        List<List<Integer>> matrix = new ArrayList<>(a);
        for (Integer i = 0; i < a; i++) {
            List<Integer> row = new ArrayList<>();
            for (Integer j = 0; j < b; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                row.add(InputInteger());
            }
            matrix.add(row);
        }
        System.out.println("Ma trận vừa nhập:");
        matrix.forEach(System.out::println);
    }

    public void Bai_19() {
        System.out.println("Bài 19.");
        List<List<Integer>> list = new ArrayList<>(2);
        list.set(1, Arrays.asList(60, 55, 70));
        list.set(2, Arrays.asList(80, 60, 41));
        IntSummaryStatistics scoreStudent1 = list.get(1).stream().mapToInt((a) -> a). summaryStatistics();
        IntSummaryStatistics scoreStudent2 = list.get(2).stream().mapToInt((a) -> a). summaryStatistics();
        System.out.println("Điểm trung bình của học sinh thứ nhất là: " + scoreStudent1.getAverage());
        System.out.println("Điểm trung bình của học sinh thứ hai là: " + scoreStudent2.getAverage());
    }

}
