import java.util.*;

public class factorial {
    public static void main(String args[]) {

        int fact = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter the number you want factorial");

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            fact = fact * i;

        }
        System.out.println(fact);
    }
}
