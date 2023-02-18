package vkduy.com;

import java.util.List;

/**
 * Hello world!
 *
 */
public class Program
{
    public static void main( String[] args )
    {
//        List<Integer> integerList = new Bai3().inputArrays();
//        integerList = new Bai3().SortArrays(integerList);
//        new Bai3().DisplayArrays(integerList);
//        new Bai3().DisplayMinItem(integerList);
//        new Bai3().DisplayAverageItemDivide3(integerList);

        List<Student> studentList = new Bai4().inputStudentList();
        new Bai4().outputStudentList(studentList);
    }
}
