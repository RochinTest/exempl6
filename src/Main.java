import java.util.Scanner;

public class Main {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        if (sc.hasNextInt()) System.out.println(0 == sc.nextInt() % 2);
    }
}