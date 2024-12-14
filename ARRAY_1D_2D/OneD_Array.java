import java.util.*;

public class OneD_Array {
    public static void main(String[] args) {
        int a[] = new int[4];
        for (int i = 0; i <= 3; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(a[6]); // ArrayIndexOutOfBoundsException
    }

}
