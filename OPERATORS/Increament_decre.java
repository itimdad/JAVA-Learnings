
public class Increament_decre {

    public static void main(String args[]) {
        // int a = 5;
        // int b = ++a;
        int a = 5;
        // int b = a++ + ++a + --a;
        int b;
        b = a++ + ++a + ++a + a++ + --a + a--;
        System.out.println(a);

        System.out.println(b);

    }
}