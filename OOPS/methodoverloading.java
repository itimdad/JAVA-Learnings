class calc {

    public int add(int n1, int n2) {

        int result = n1 + n2;
        return result;
    }

    public int add2(int n1, int n2, int n3) {

        int result = n1 + n2 + n3;
        return result;
    }

}

public class methodoverloading {

    public static void main(String args[]) {

        calc obj = new calc();

        int result1 = obj.add(4, 3);
        System.out.println(result1);

        int result2 = obj.add2(1, 3, 4);
        System.out.println(result2);
    }
}