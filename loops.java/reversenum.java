import java.util.*;

public class reversenum {
    public static void main(String args[]) {
        System.out.println("Enter the number you want reverse");

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

}
