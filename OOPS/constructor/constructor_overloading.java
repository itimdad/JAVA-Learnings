import java.util.*;

class Student {

    String name;
    int age;

    public Student() {
        name = "rohit";
        age = 18;
    }

    public Student(String name)

    {
        this.name = name;
        age = 19;
    }

    public Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void getData() {
        System.out.println(name);
        System.out.println(age);
    }

}

public class constructor_overloading {
    public static void main(String args[]) {

        Student dt1 = new Student();
        dt1.getData();
        Student dt2 = new Student("raj");
        dt2.getData();
        Student dt3 = new Student("imdad", 20);
        dt3.getData();

    }

}
