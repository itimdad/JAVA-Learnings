import java.util.*;

public class memoryMap {
    public static void main(String[] args) {
        // String s1 = "pwskills";

        // String s2 = new String("pwskills");

        // System.out.println(s1.equals(s2)); // equals()

        // String s4 = "pwjava";
        // String s5 = "pwjava";
        // String s6 = "pwJAVA";

        // System.out.println(s4 == s5);
        // System.out.println(s4 == s6);
        // System.out.println(s4.equals(s5));
        // System.out.println(s4.equals(s6));

        String s1 = "pwskills";
        String s2 = new String("pwskills");
        String s3 = new String("Pwskills");

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1.equalsIgnoreCase(s2)); // ignore the case sensivity
        System.out.println(s2.equalsIgnoreCase(s3));
    }

}
