import java.util.Scanner;
public class Class{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        a = (a+b) - b;
        b = (a+b) - b;
        System.out.println(a + " " +  b);
    }
}
