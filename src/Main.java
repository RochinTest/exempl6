import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            if (sc.nextInt() % 2 == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}