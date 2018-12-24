import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt())
        {
            int m = sc.nextInt();
            {
                int d = 1; int c = 1;
                d = m % 2;
                if (d == 0) //a = a + 1;

                    System.out.println("true");
                else System.out.println("false");
            }
        }
    }
}