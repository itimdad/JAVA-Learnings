import javax.lang.model.util.ElementScanner14;

public class ifelse {
    public static void main(String args[]) {
        // int age = 18;

        // if (age >= 18) {
        // System.out.println("adult");
        // } else {
        // System.out.println("not adult");
        // }
        // int age = 15;
        // if (age >= 18 && age < 60) {
        // System.out.println("you are adult");
        // } else if (age >= 60) {
        // System.out.println("you are old");
        // } else {
        // System.out.println(" you are kid");
        // }
        int age = 30;

        if (age >= 18 && age <= 60) {
            if (age >= 20 && age <= 30) {
                System.out.println("you are in 20's");
            } else if (age >= 30 && age <= 40) {
                System.out.println("youre in 30's");
            } else {
                System.out.println("teen");
            }
        } else if (age > 60) {
            System.out.println();
        } else {
            System.out.println();
        }
    }

}
