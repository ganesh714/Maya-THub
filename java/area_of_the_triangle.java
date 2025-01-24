import java.util.Scanner;

public class AOT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double s = (a + b + c)/2f;
        System.out.printf("%.2f",Math.sqrt(s * (s - a) * (s - b) * (s - c)));

    }
}
