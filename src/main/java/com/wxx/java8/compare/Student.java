package com.wxx.java8.compare;

public class Student implements Comparable<Student> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student student) {
        if (this.age >= student.age)
            return 1;
        return -1;
    }

    @Override
    public String toString() {
        return "name: " + this.name + " age:" + this.age;
    }
}
