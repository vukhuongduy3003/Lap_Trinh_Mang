package vkduy.com;

import java.util.Collection;
import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String fullName;
    private Float mark;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Float getMark() {
        return mark;
    }

    public void setMark(Float mark) {
        this.mark = mark;
    }

    private String rank(Float mark) {
        if (mark < 5) {
            return "Yếu";
        }
        else if (5 <= mark && mark < 6.5) {
            return "Trung bình";
        }
        else if (6.5 <= mark && mark < 7.5) {
            return "Khá";
        }
        else if (7.5 <= mark && mark < 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", mark=" + mark + ", rank=" + rank(mark) +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMark().compareTo(o2.getMark());
    }
}
