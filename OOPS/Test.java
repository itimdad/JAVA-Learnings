
public class Test {

    int a; // instance variable
    String name = "rahul"; // instatnce variab (global variable)

    public static void main(String[] args) {

        // declare the variable
        // create the object

        int num = 9; // primitive variable
        Test obj1 = new Test(); // reference variable
        Test obj2 = new Test();

        obj1.name = "imdada";

        System.out.println(obj1.name);
        System.out.println(obj1.a);

        System.out.println(obj2.name);
        System.out.println(obj2.a);

    }
}