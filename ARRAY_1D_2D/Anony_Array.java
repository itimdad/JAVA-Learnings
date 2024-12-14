import java.util.*;

class calc {
    public int add(int num[]) {
        int result = 0;
        for (int n : num) {
            result = result + n;
        }
        return result;
    }
}

public class Anony_Array {
    public static void main(String[] args) {

        calc obj = new calc();

        int result = obj.add(new int[] { 3, 5, 6, 7, 8, 9 }); // AnonymousArray
        System.out.println(result);

    }
}
