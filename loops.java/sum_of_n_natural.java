import java.util.*;

public class sum_of_n_natural {

    public static void main(String args[]) {

        int sum = 0;
        Scanner nat = new Scanner(System.in);

        System.out.println("enter the number");
        int num = nat.nextInt();

        for (int i = 1; i <= num; i++) {

            // sum = sum + i;

            sum = (num * (num + 1)) / 2;

        }
        System.out.println(sum);
    }
}
