import java.util.*;

class Student {
    private String name;
    private int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;

    }

    // public void setName(String name) {

    // this.name = name;

    // }

    // public void setAge(int age) {

    // this.age = age; // this keyword used to remove shadowing problem

    // }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;

    }
}

class constructor {  //constructor is used to remove the setter and initialize value of variable in the time of object creation
    public static void main(String args[]) {

        Student obj = new Student("imdadkhan", 18);

        // obj.setName("imdad");
        // obj.setAge(20);

        String name = obj.getName();
        int age = obj.getAge();

        System.out.println(name);

        System.out.println(age);
    }

}
