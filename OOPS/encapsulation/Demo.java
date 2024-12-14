import java.util.*;

class Student {

    private int age;
    private String name;

    public void show() {
        System.out.println(name + " " + age);

    }

    public void setData() {
        age = 18;
        name = "imdad";

    }

}

public class Demo {
    public static void main(String args[]) {

        Student obj = new Student();

        obj.setData();

        obj.show();

    }

}
