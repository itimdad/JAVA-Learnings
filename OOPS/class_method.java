import java.util.*;

class Student {

    String name;
    int age;
    int roll;

    public void SetData() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();

        System.out.println("Enter age");

        age = sc.nextInt();

        System.out.println("Enter roll");

        roll = sc.nextInt();

    }

    public void getData() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll);
    }
}

public class class_method {
    public static void main(String args[]) {

        Student obj = new Student();

        obj.SetData();
        obj.getData();
    }

}
