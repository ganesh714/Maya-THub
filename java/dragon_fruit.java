import java.util.Scanner;

public class Maya{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 2 && n % 2 == 0) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
