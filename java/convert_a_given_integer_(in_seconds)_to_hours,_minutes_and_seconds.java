import java.util.Scanner;
public class MoveCnt{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int h = s / 3600;
        s %= 3600;
        int m = s / 60;
        s %= 60;
        System.out.println("H:M:S-" + h + ":" + m + ":" + s);
    }
}
