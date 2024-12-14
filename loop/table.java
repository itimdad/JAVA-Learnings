import java.util.*;

public class table {
    public static void main(String args[]) {

        System.out.println("Enter the number you want table");
        Scanner tb = new Scanner(System.in);

        int num = tb.nextInt();

        for (int i = 2; i <= 10; i++) {

            int result = num * i;
            System.out.println(num + "*" + i + "=" + result);
        }

    }

}
