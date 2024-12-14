class Student {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;

    }

    public void setName(String name) {

        this.name = name; // shadowing problem soln.

    }

    public void show() {

        System.out.println(age + " " + name);

    }

    public void setAge1(int age) {

        this.age = age; // shadowing problem

    }

    public void setName1(String name) {

        this.name = name;
    }

    public void show1() {

        System.out.println(age + " " + name);

    }
}

public class setterGetter {
    public static void main(String args[]) {

        Student obj = new Student();
        Student obj2 = new Student();

        obj2.setAge(23);
        obj2.setName("khan");
        obj2.show();

        obj.setAge1(12);
        obj.setName1("imdad");
        obj.show1();

    }

}
