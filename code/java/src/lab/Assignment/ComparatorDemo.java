package lab.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getAge(), student2.getAge());
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 25));
        studentList.add(new Student("Bob", 21));
        studentList.add(new Student("Charlie", 23));

        System.out.println("Original List:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Sorting using AgeComparator
        Collections.sort(studentList, new AgeComparator());

        System.out.println("\nList after sorting by age:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
