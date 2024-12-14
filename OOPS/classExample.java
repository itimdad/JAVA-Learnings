import java.util.*;

class Box {

    private int length;
    private int breadth;
    private int height;

    public void setData(int l, int b, int h) {

        length = l;
        breadth = b;
        height = h;

    }

    public void showData() {

        System.out.println("L=" + length);
        System.out.println("b=" + breadth);
        System.out.println("h=" + height);

    }
}

public class classExample {
    public static void main(String args[]) {

        Box obj = new Box();

        obj.setData(12, 10, 4);
        obj.showData();

    }
}