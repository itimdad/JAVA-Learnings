import java.util.*;

public class prime_no {

    public static int main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int num = sc.nextInt();

        if (num < 2) {
            System.out.println("not prime");

            return 0;
        } else {

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    System.out.println("prime number");

                    return 0;
                }

                else {
                    System.out.println("not prime");
                    return 0;
                }

            }
        }
        return 0;

    }

}
