import java.util.Scanner;

public class CF{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
    
            if (a == b && b == c) {
                System.out.println("NO");
            }
            else if (a+b < c || a+c < b || b+c < a) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
