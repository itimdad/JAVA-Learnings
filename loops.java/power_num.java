import java.util.*;

public class power_num {

    public static void main(String args[]) {

        int num;

        Scanner power = new Scanner(System.in);

        System.out.println("enter the number");
        int n = power.nextInt();

        System.out.println("Enter the power");

        int pow = power.nextInt();

        num = n;

        for (int i = 1; i < pow; i++) {

            num = num * n;

        }

        System.out.println(num);
    }

}
