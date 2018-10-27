package com.wxx.java8.compare;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareClient {
    public static void main(String[] args) {
        Student student1 = new Student("sa", 10);
        Student student2 = new Student("sb", 7);
        Student student3 = new Student("sc", 9);
        Student[] students = {student1, student2, student3};
        System.out.println("---排序前---");
        for (Student student : students) {
            System.out.println(student.toString());
        }
        //sort方法比较的数组需要是一个实现了Comparable接口的类
        //因为sort方法内部需要用compareTo方法进行两个值得比较
        //使用的是mergesort算法对数组中的元素进行排序
        Arrays.sort(students);
        System.out.println("---Arrays.sort通过compareTo方法对age排序后---");
        for (Student student : students) {
            System.out.println(student.toString());
        }
        Arrays.sort(students, (student4, student5) -> {
            //Comparator<Student> comparing = Comparator.comparing(Student::getName);
            return student4.getName().compareTo(student5.getName());
        });
        System.out.println("---Arrays.sort通过比较器对name排序后---");
        for (Student student : students) {
            System.out.println(student.toString());
        }
        //Arrays.stream(students).sorted()
        //Integer public static int compare(int x, int y)
        //Double public static int compare(double d1, double d2)

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        System.out.println("---排序前-1--");
        printForeach(studentList);
        Collections.sort(studentList);
        System.out.println("---Arrays.sort通过compareTo方法对age排序后-1--");
        printForeach(studentList);
        Collections.sort(studentList, (student4, student5) -> {
            //Comparator<Student> comparing = Comparator.comparing(Student::getName);
            return student4.getName().compareTo(student5.getName());
        });
        System.out.println("---Arrays.sort通过比较器对name排序后-1--");
        printForeach(studentList);
    }

    private static void printForeach(Object o) {
        if (o instanceof List) {
            List<Student> o1 = (List<Student>) o;
            o1.stream().forEach(System.out::println);
        }
        if (o.getClass().isArray()) {
            int length = Array.getLength(o);
            Student[] students = new Student[length];
            for (int i = 0; i < length; i++) {
                students[i] = (Student) Array.get(o, i);
            }
            Arrays.stream(students).forEach(System.out::println);
        }

    }
}
