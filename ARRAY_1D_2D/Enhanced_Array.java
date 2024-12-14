public class Enhanced_Array {
    public static void main(String[] args) {
        int nums[][] = {
                { 4, 5, 5, 8 }, { 5, 6, 9, 8 }, { 5, 5, 4, 5 }
        };
        for (int a[] : nums) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}