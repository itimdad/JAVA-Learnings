import java.util.*;

public class index {
    public static void main(String args[]) {

        System.out.println("Enter your number");
        Scanner obj = new Scanner(System.in);

        int age = obj.nextInt();

        if (age > 18) {

            System.out.println("adult");

        } else if (age < 18) {
            System.out.println("not adult");

        }

        else {
            System.out.println("degfault");
        }

    }

}
