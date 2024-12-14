public class ternary_operator {
    public static void main(String[] args) {

        int a = 10, b = 13, c = 30;

        int res = (a < b) ? a : b;
        System.out.println(res);
        String result = (a < b) ? "A is less " : "b is greater";
        System.out.println(result);
        int numb = (a < b) ? (a < c ? a : b) : (b < c ? b : c);
        System.out.println(numb);
    }

}
