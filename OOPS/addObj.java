class calc {
    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public int add(int n1, int n2, int n3) {
        int result = n1 + n2 + n3;
        return result;
    }
}

public class addObj {
    public static void main(String[] args) {

        calc obj = new calc();
        int result = obj.add(2, 3);
        int res1 = obj.add(2, 4, 5);
        System.out.println(res1);

        System.out.println(result);

    }

}
