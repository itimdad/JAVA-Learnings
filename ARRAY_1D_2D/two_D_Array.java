
public class two_D_Array {
    public static void main(String args[]) {
        int nums[][] = {
                { 2, 2, 3, 5 }, { 3, 3 }, { 4, 4 }
        };
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= nums.length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

}
