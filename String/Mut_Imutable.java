import java.util.*;

public class Mut_Imutable {
    public static void main(String[] args) {
        String imdad = "goa";
        System.out.println(imdad);
        imdad.concat("bengaluru");
        System.out.println(imdad);

        StringBuilder imdad1 = new StringBuilder("pwskills");
        System.out.println(imdad1);
        imdad1.append("bengaluru");
        System.out.println(imdad1);
    }

}
