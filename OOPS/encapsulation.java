class Student {
    private int age;
    private String name;

    public void setData(int age, String name) {
        this.age = age;
        this.name = name; // shadowing problem soln.

    }

    public void show() {

        System.out.println(age + " " + name);

    }

    public void setData1(int age, String name) {

        this.age = age; // shadowing problem
        this.name = name;
    }

    public void show1() {

        System.out.println(age + " " + name);

    }
}

public class encapsulation {
    public static void main(String args[]) {

        Student obj = new Student();
        Student obj2 = new Student();

        obj2.setData(23, "khan");
        obj2.show();

        obj.setData1(12, "imdad");
        obj.show1();

    }

}
